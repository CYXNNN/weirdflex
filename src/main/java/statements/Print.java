package statements;

import AST.Exp;
import AST.Statement;
import AST.Visitor;

public class Print extends Statement {
  private Exp e;

  public Print(Exp e, int ln) {
    super(ln);
    this.e=e;
  }

  @Override
  public void execute() {
    System.out.println(e.execute());
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}

