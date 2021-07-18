package AST;

public class Identifier extends Node {
  private String name;

  public Identifier(String name, int ln) {
    super(ln);
    this.name = name;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

  public String toString(){
    return name;
  }
}
