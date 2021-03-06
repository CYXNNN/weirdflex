package AST;

import java.util.Vector;
import statements.VarDeclaration;

public class MethodDeclList extends Node{
  private Vector list;

  public MethodDeclList(int ln) {
    super(ln);
    list = new Vector();
  }

  public void addElement(MethodDecl n) {
    list.addElement(n);
  }

  public MethodDecl elementAt(int i)  {
    return (MethodDecl)list.elementAt(i);
  }

  public int size() {
    return list.size();
  }

  public void execute() {
    for (Object f : list) {
      ((MethodDecl) f).execute();
    }
  }
}
