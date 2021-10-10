package exception;

public enum Error {
    DEFAULT("Unspecified semantic error"),
    PARAM("Method {0} expects {1} parameters but {2} were supplied"),
    UNKNOWN_METHOD("Method {0} not declared"),
    DIVISON_BY_ZERO("Division by zero... Are u trying to destroy the world?"),
    VAR_DECL_EXISTS("Variable {0} already declared"),
    VAR_DECL_NOT_EXISTS("Variable {0} has not been declared"),
    NULL("Variable {0} is null"),
    NOT_NUMERICAL("Variable {0} is not numerical"),
    OUT_OF_SCOPE("Variable {0} is not defined in the current scope"),
    RESERVED_WORD("{0} is a reserved word");

    public String msg;

    Error(String msg) {
        this.msg = msg;
    }

}
