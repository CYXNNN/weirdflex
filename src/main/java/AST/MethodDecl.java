package AST;

import exception.Error;
import exception.WeirdException;
import util.Callable;
import util.ScopeStore;
import util.Variable;

public class MethodDecl extends Node implements Callable {
  public Identifier identifier;
  public FormalList params;
  public VarDeclList vars;
  public StatementList statements;
  public Exp returnExp;
  private ScopeStore store = ScopeStore.getInstance();

  public MethodDecl(Identifier identifier, FormalList params, VarDeclList vars,
    StatementList statements, Exp returnExp, int ln) {
    super(ln);

    this.identifier = identifier;
    this.params = params;
    this.vars = vars;
    this.statements = statements;
    this.returnExp = returnExp;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public void execute() {
    store.putFunc(identifier.toString(), this);
  }

  @Override
  public Object call(FormalList params) {

    // check if method is declared
    if (store.getFunc(this.identifier.toString()) == null) {
      throw new WeirdException(Error.UNKNOWN_METHOD, this.identifier.toString());
    }

    store.ctx = identifier.toString();

    for(int i = 0; i < this.params.size(); i++) {
      var current = this.params.elementAt(i);
      store.putVar(current.toString(),
        new Variable().build(current.toString(),
          identifier.toString(),
          store.getVar(params.elementAt(i).toString()).value));
    }

    // check if supplied params equals to defined
    if (params.size() != this.params.size()) {
      throw new WeirdException(Error.PARAM,
              this.identifier.toString(),
              String.valueOf(this.params.size()),
              String.valueOf(params.size()));
    }

    vars.execute();
    statements.execute();

    store.ctx = "global";

    if (returnExp != null) {
      return returnExp.execute();
    }

    return null;
  }
}
