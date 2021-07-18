package expressions;

import AST.Exp;
import AST.Visitor;

public class Times extends Exp {
  private Exp left;
  private Exp right;

  public Times(Exp left, Exp right, int line) {
    super(line);
    this.left = left;
    this.right = right;
  }

  @Override
  public Object execute() {
    var a = (Integer) left.execute();
    var b = (Integer) right.execute();

    return  a * b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}
