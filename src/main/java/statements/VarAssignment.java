package statements;

import AST.Exp;
import AST.Identifier;
import AST.Node;
import AST.Statement;
import AST.Visitor;
import exception.Error;
import exception.WeirdException;
import java.beans.Expression;
import util.ScopeStore;
import util.Variable;

public class VarAssignment extends Statement {
	public String i;
	public Exp e;
	private ScopeStore store = ScopeStore.getInstance();

	public VarAssignment(String ai, Exp ae, int ln) {
		super(ln);
		this.i=ai;
		this.e=ae;
	}

	@Override
	public void execute() {

		var v = store.getVar(i);

		if (v == null) {
			throw new WeirdException(Error.VAR_DECL_NOT_EXISTS, i);
		}

		var value = e == null ? null : e.execute();

		if (value instanceof Variable) {
			v.value = ((Variable) value).value;
		} else {
			v.value = value;
		}

		store.putVar(i, v);

	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
