package expressions;

import AST.Exp;
import AST.Visitor;

public class IntegerLiteral extends Exp {
  private int i;

  public IntegerLiteral(int i, int ln) {
    super(ln);
    this.i=i;
  }

  @Override
  public Object execute() {
    return i;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
