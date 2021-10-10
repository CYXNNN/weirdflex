package exception;

public enum Error {
    DEFAULT("Line {0}: Unspecified semantic error"),
    PARAM("Line {0}: Method {1} expects {2} parameters but {3} were supplied"),
    UNKNOWN_METHOD("Line {0}: Method {1} not declared"),
    DIVISON_BY_ZERO("Line {0}: Division by zero... Are u trying to destroy the world?"),
    VAR_DECL_EXISTS("Line {0}: Variable {1} already declared");

    public String msg;

    Error(String msg) {
        this.msg = msg;
    }

}