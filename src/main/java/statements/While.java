package statements;

import AST.Exp;
import AST.Statement;
import AST.StatementList;
import AST.Visitor;

public class While extends Statement {
  private Exp e;
  public StatementList statements;

  public While(Exp exp,StatementList statements, int ln) {
    super(ln);
    this.e = exp;
    this.statements = statements;
  }

  @Override
  public void execute() {

    while((Boolean) e.execute()) {
      statements.execute();
    }
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
