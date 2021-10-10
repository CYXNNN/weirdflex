package AST;

import exception.Error;
import exception.WeirdException;
import util.Variable;

public abstract class Exp extends Node {
  public Exp(int line) {
    super(line);
  }

  public abstract Object execute();
  public abstract void accept(Visitor v);

  public Integer getNumericValue(Object o) {
    if (o instanceof Variable) {
      return (Integer)((Variable) o).value;
    }
    try {
      return (Integer) o;
    } catch (ClassCastException e) {
      throw new WeirdException(Error.NOT_NUMERICAL, o.toString());
    }

  }
}
