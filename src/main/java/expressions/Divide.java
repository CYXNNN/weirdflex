package expressions;

import AST.Exp;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;

public class Divide extends Exp {

  private Exp left;
  private Exp right;

  public Divide(Exp left, Exp right, int line) {
    super(line);
    this.left = left;
    this.right = right;
  }

  @Override
  public Object execute() {
    var a = (Integer) left.execute();
    var b = (Integer) right.execute();

    if (b == 0) {
      throw new WeirdException(Error.DIVISON_BY_ZERO, line());
    }

    return  a / b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
