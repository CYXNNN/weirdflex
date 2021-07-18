package AST;

public class Formal extends Node {
  private Identifier identifier;

  public Formal(Identifier identifier, int ln) {
    super(ln);
    this.identifier = identifier;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
