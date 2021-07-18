package statements;

import AST.Exp;
import AST.Statement;
import AST.Visitor;

public class While extends Statement {
  private Exp e;
  private Statement s;

  public While(Exp ae, Statement as, int ln) {
    super(ln);
    e=ae; s=as;
  }

  @Override
  public void execute() {
    while((Boolean) e.execute()) {
      s.execute();
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
