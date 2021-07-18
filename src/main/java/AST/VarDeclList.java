package AST;

import java.util.Vector;
import statements.VarDeclaration;

public class VarDeclList extends Node{
  private Vector list;

  public VarDeclList(int ln) {
    super(ln);
    list = new Vector();
  }

  public void addElement(VarDeclaration n) {
    list.addElement(n);
  }

  public VarDeclaration elementAt(int i)  {
    return (VarDeclaration)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }

  public void execute() {
    for (Object v : list) {
      ((VarDeclaration) v).execute();
    }
  }
}
