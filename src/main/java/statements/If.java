package statements;

import AST.Exp;
import AST.Statement;
import AST.Visitor;

public class If extends Statement {
  private Exp e;
  private Statement s1,s2;

  public If(Exp ae, Statement as1, Statement as2, int ln) {
    super(ln);
    this.e=ae;
    this.s1=as1;
    this.s2=as2;
  }

  @Override
  public void execute() {
    if ((Boolean) e.execute() == true) {
      s1.execute();
    } else {
      if (s2 != null) {
        s2.execute();
      }
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
