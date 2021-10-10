package exception;

import java.text.MessageFormat;

public class WeirdException extends RuntimeException {

    public WeirdException() {
        super(Error.DEFAULT.msg);
    }

    public WeirdException(Error key, String... args) {
        super(MessageFormat.format(key.msg, args));
    }

}
