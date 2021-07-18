package AST;

import expressions.Call;
import expressions.Divide;
import expressions.Eq;
import expressions.False;
import expressions.IdentifierExp;
import expressions.IntegerLiteral;
import expressions.Minus;
import expressions.Modulo;
import expressions.Plus;
import expressions.Times;
import expressions.True;
import statements.If;
import statements.Print;
import statements.VarDeclaration;
import statements.While;

public interface Visitor {

  void visit(Program n);
  void visit(MethodDecl n);
  void visit(Formal n);
  void visit(Identifier n);
  void visit(VarDeclaration n);

  // expressions
  void visit(Call n);
  void visit(Eq eq);
  void visit(Plus n);
  void visit(Minus n);
  void visit(Times n);
  void visit(Divide n);
  void visit(Modulo n);
  void visit(True n);
  void visit(False n);
  void visit(IdentifierExp n);
  void visit(IntegerLiteral n);

  // statements
  void visit(If n);
  void visit(Print n);
  void visit(While n);

}
