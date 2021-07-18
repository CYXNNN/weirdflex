package expressions;

import AST.Exp;
import AST.Visitor;

public class False extends Exp {
  public False(int ln) {
    super(ln);
  }

  @Override
  public Object execute() {
    return false;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
