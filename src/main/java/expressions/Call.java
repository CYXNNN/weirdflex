package expressions;

import AST.Exp;
import AST.FormalList;
import AST.Identifier;
import AST.Statement;
import AST.Visitor;
import util.ScopeStore;

public class Call extends Exp {

  private Identifier identifier;
  private FormalList params;
  private ScopeStore store = ScopeStore.getInstance();

  public Call(Identifier i, FormalList params, int line) {
    super(line);

    this.identifier = i;
    this.params = params;
  }

  public Object execute() {

    var name = identifier.toString();
    var func = store.getFunc(name);

    return func.call(params);
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
