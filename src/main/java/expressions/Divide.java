package expressions;

import AST.Exp;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import util.SemanticCheck;

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
    var a = getNumericValue(left.execute());
    var b = getNumericValue(right.execute());

    SemanticCheck.checkTypeOperatable(a);
    SemanticCheck.checkTypeOperatable(b);
    SemanticCheck.checkNullValue(a, left);
    SemanticCheck.checkNullValue(b, right);

    if (b == 0) {
      throw new WeirdException(Error.DIVISON_BY_ZERO);
    }

    return  a / b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
