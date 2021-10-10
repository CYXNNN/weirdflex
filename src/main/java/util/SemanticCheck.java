package util;

import AST.Exp;
import exception.Error;
import exception.WeirdException;
import java.util.Arrays;

public class SemanticCheck {

	public static final String[] RESERVED_WORDS = {"func", "if", "else", "end", "showme", "return", "true", "false", "var", "mod", "less", "greater"};

	public static void checkTypeOperatable(Object o) {
		if ((o instanceof Variable &&
			!((Variable) o).type.equals("number")) ||
			o instanceof String ||
			o instanceof Boolean) {

			throw new WeirdException(Error.NOT_NUMERICAL, o.toString());
		}
	}

	public static void checkNullValue(Object value, Exp e) {
		if (value == null) {
			throw new WeirdException(Error.NULL, e.toString());
		}
	}

	public static void checkWording(String s) {
		if (Arrays.asList(RESERVED_WORDS).contains(s)) {
			throw new WeirdException(Error.RESERVED_WORD, s);
		}
	}

}
