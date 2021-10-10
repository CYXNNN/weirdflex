package expressions;

import AST.Exp;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import util.SemanticCheck;
import util.Variable;

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
    var a = getNumericValue(left.execute());
    var b = getNumericValue(right.execute());

    SemanticCheck.checkTypeOperatable(a);
    SemanticCheck.checkTypeOperatable(b);
    SemanticCheck.checkNullValue(a, left);
    SemanticCheck.checkNullValue(b, right);

    return a + b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}

