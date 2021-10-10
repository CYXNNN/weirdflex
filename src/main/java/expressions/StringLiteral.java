package expressions;

import AST.Exp;
import AST.Visitor;

public class StringLiteral extends Exp {
  private String i;

  public StringLiteral(String i, int ln) {
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
