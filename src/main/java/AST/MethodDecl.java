package AST;

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

  public Object execute() {
    return null;
  }

  @Override
  public Object call(FormalList params) {

    return returnExp.execute();


  }
}
