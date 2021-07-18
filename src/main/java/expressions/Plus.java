package expressions;

import AST.Exp;
import AST.Visitor;

public class Plus extends Exp {
  public Exp left;
  public Exp right;

  public Plus(Exp left, Exp right, int line) {
    super(line);
    this.left = left;
    this.right = right;
  }

  @Override
  public Object execute() {
    var a = (Integer) left.execute();
    var b = (Integer) right.execute();

    return  a + b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}

