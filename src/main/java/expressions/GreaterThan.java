package expressions;

import AST.Exp;
import AST.Visitor;
import util.SemanticCheck;
import util.Variable;

public class GreaterThan extends Exp {
  public Exp left;
  public Exp right;

  public GreaterThan(Exp left, Exp right, int line) {
    super(line);
    this.left = left;
    this.right = right;
  }

  @Override
  public Object execute() {
    var a = left.execute();
    var b = right.execute();

    SemanticCheck.checkTypeOperatable(a);
    SemanticCheck.checkTypeOperatable(b);

    return  (Integer) a > (Integer) b;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}

