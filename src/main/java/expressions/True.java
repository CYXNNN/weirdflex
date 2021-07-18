package expressions;

import AST.Exp;
import AST.Visitor;

public class True extends Exp {
  public True(int ln) {
    super(ln);
  }

  @Override
  public Object execute() {
    return true;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
