package statements;

import AST.Exp;
import AST.Identifier;
import AST.Statement;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import util.ScopeStore;

public class VarDeclaration extends Statement {

  public Identifier i;
  public Exp e;
  private ScopeStore store = ScopeStore.getInstance();

  public VarDeclaration(Identifier ai, Exp ae, int ln) {
    super(ln);
    this.i=ai;
    this.e=ae;
  }

  @Override
  public void execute() {
    var name = i.toString();

    if (store.getVar(name) != null) {
      throw new WeirdException(Error.VAR_DECL_EXISTS, line(), name);
    }

    store.putVar(i.toString(), e.execute());
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
