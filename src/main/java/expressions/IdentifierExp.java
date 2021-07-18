package expressions;

import AST.Exp;
import AST.Visitor;
import util.ScopeStore;

public class IdentifierExp extends Exp {
  private String s;
  private ScopeStore store = ScopeStore.getInstance();

  public IdentifierExp(String s, int ln) {
    super(ln);
    this.s=s;
  }

  @Override
  public Object execute() {
    return store.getVar(s);
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}

