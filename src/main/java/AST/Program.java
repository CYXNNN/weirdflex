package AST;

public class Program extends Node{

  private VarDeclList vars;
  private MethodDeclList functions;
  private StatementList statements;

  public Program(VarDeclList vars, MethodDeclList functions, StatementList statements, int ln) {
    super(ln);
    this.vars = vars;
    this.functions = functions;
    this.statements = statements;
  }

  public void execute() {
    vars.execute();
    functions.execute();
    statements.execute();
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
