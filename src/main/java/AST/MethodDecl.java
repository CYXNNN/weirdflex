package AST;

import exception.Error;
import exception.WeirdException;
import util.Callable;
import util.ScopeStore;

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
      throw new WeirdException(Error.UNKNOWN_METHOD, line(), this.identifier.toString());
    }

    // check if supplied params equals to defined
    if (params.size() != this.params.size()) {
      throw new WeirdException(Error.PARAM,
              line(),
              this.identifier.toString(),
              String.valueOf(this.params.size()),
              String.valueOf(params.size()));
    }

    vars.execute();
    statements.execute();
    return returnExp.execute();
  }
}
