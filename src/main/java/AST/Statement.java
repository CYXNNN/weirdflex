package AST;

public abstract class Statement extends Node {
  public Statement(int ln) {
    super(ln);
  }

  public abstract void execute();
  public abstract void accept(Visitor v);
}
