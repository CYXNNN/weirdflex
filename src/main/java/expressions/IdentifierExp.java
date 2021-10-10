package expressions;

import AST.Exp;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import util.ScopeStore;
import util.SemanticCheck;

public class IdentifierExp extends Exp {
  public String s;
  private ScopeStore store = ScopeStore.getInstance();

  public IdentifierExp(String s, int ln) {
    super(ln);
    this.s=s;
  }

  @Override
  public Object execute() {

    SemanticCheck.checkWording(s);

    if (!store.variables.containsKey(s)) {
      throw new WeirdException(Error.VAR_DECL_NOT_EXISTS, s);
    }

    return store.getVar(s);
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

  @Override
  public String toString() {
    return s;
  }
}

