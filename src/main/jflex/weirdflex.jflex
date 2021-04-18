//import java_cup.runtime.*;
import java.io.*;
import java_cup.runtime.*;


%%
%class WeirdFlex
%unicode
%standalone
%line
%column


%{
    private void printToken(String type) {
      System.out.print(type + " ");
    }

  private void printToken(String type, Object value) {
    System.out.print(type + "(" + value.toString() + ") ");
  }
  private Symbol symbol(int type) {
    System.out.println("(" + type + ")");
    return new Symbol(type, yyline, yycolumn);
  }
  private Symbol symbol(int type, Object value) {
    System.out.println("(" + type + ", " + value + ")");
    return new Symbol(type, yyline, yycolumn, value);
  }
%}

// lexical declarations
text = \"[0-9a-zA-Z]+\"
space = [\ \t]
linebreak = \n|\r|\r\n
integer = [1-9][0-9]*
comment = ["#":jletter:]

identifier = [:jletter:]*
func_key = "func"
stmnt_close_key = "end"
while_key = "aslong"
for_key = "each"
in_key = "of"
if_key = "if"
else_key = "else"

%%

<YYINITIAL> {

  "true" {printToken("CONSTANT", yytext());}
  "false" {printToken("CONSTANT", yytext());}
  "<" {printToken("PARAM_S", yytext());}
  ">" {printToken("PARAM_E", yytext());}
  "(" {printToken("P_R");}
  ")" {printToken("P_L");}
  {text} {printToken("STRING", yytext());}
  {integer} {printToken("INTEGER", yytext());}
  {func_key} {printToken("FUNC_DECLARE_START");}
  {stmnt_close_key} {printToken("END");}
  {for_key} {printToken("FOR");}
  {in_key} {printToken("IN");}
  {if_key} {printToken("IF");}
  {else_key} {printToken("ELSE");}
  {while_key} {printToken("WHILE");}
  "+" | "-" | "*" | "/" | "^" | "mod" | "=" | "==" {printToken("OPERATOR", yytext());}
  {identifier} {printToken("IDENTIFIER", yytext());}

  // IGNORE
  {linebreak} {System.out.println("");}
  {space} | {comment} {}

}


// fallback for invalid syntax
[^] {
    System.out.println("SYNTAX ERROR: " + yytext());
}
