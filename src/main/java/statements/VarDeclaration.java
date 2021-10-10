package statements;

import AST.Exp;
import AST.Identifier;
import AST.Statement;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import util.ScopeStore;
import util.Variable;

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
      throw new WeirdException(Error.VAR_DECL_EXISTS, name);
    }

    var value = e == null ? null : e.execute();

    store.putVar(name, new Variable().build(name, "global", value));
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
