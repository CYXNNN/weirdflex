package AST;

public abstract class Exp extends Node {
  public Exp(int line) {
    super(line);
  }

  public abstract Object execute();
  public abstract void accept(Visitor v);
}
