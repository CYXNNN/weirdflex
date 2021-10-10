package statements;

import AST.Exp;
import AST.Statement;
import AST.Visitor;
import util.Variable;

public class Print extends Statement {
  private Exp e;

  public Print(Exp e, int ln) {
    super(ln);
    this.e=e;
  }

  @Override
  public void execute() {

    var res = e.execute();

    if (res instanceof Variable) {
      System.out.println(((Variable) res).value);
    } else {
      System.out.println(res);
    }

  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}

