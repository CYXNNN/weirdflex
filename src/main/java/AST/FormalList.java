package AST;

import java.util.Vector;

public class FormalList extends Node {
  private Vector list;

  public FormalList(int ln) {
    super(ln);
    list = new Vector();
  }

  public void addElement(Identifier param) {
    list.add(0, param);
  }

  public Identifier elementAt(int i)  {
    return (Identifier)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }
}
