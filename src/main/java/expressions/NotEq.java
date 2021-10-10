package expressions;

import AST.Exp;
import AST.VarDeclList;
import AST.Visitor;
import util.Variable;

public class NotEq extends Exp {
  public Exp left;
  public Exp right;

  public NotEq(Exp left, Exp right, int line) {
    super(line);
    this.left = left;
    this.right = right;
  }

  @Override
  public Object execute() {
    var a = left.execute();
    var b = right.execute();

    if (a instanceof Variable)
      a = ((Variable) a).value;
    if (b instanceof Variable)
      b = ((Variable) b).value;

    return  !a.equals(b);
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }

}

