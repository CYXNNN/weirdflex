package AST;

import java.util.Vector;

public class StatementList extends Node {
  private Vector list;

  public StatementList(int ln) {
    super(ln);
    list = new Vector();
  }

  public void addElement(Statement n) {
    list.add(0, n);
  }

  public Statement elementAt(int i)  {
    return (Statement)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
