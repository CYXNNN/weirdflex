package AST;

abstract public class Node {
  private int line;

  public Node(int line) {
    this.line = line;
  }

  public String line() {
    return String.valueOf(line);
  }

}
