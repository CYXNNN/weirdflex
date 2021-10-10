package util;

public class Variable {

	public String name;
	public String ctx;
	public Object value;
	public String type;

	public Variable build(String name, String ctx, Object value) {
		this.name = name;
		this.ctx = ctx;
		this.value = value;

		if (value != null) {
			if (value instanceof String)
				this.type = "string";
			if (value instanceof Integer)
				this.type = "number";
			if (value instanceof Boolean)
				this.type = "bool";
		}
		return this;
	}

}
