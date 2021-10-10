import java_cup.runtime.Symbol;

%%
%public
%final
%class WeirdScanner
%unicode
%cup
%implements sym
%line
%column

%{
  StringBuffer string = new StringBuffer();

  private Symbol sym(int sym) {
    return new Symbol(sym);
  }

  private Symbol sym(int sym, Object val) {
    return new Symbol(sym, val);
  }
%}


/* Helper definitions */
text = \"[0-9a-zA-Z]+\"
digit = [0-9]
linebreak = \n|\r|\r\n
white = {linebreak}|[ \t]
identifier = [:jletter:]+
comment =  "#"[^\n]*
%state STRING
%%

{comment} { /* ignore */ }

/* types */
"true" { return sym(TRUE); }
"false" { return sym(FALSE); }

/* control flow */
"var" {return sym(VARIABLE); }
"func" { return sym(FUNC); }
"end" { return sym(END); }
"if" { return sym(IF); }
"else" { return sym(ELSE); }
"aslong" { return sym(WHILE); }
"return" { return sym(RETURN); }
"showme" { return sym(PRINT); }


/* literals */
{digit}+ { return sym(INTEGER_LITERAL, new Integer(yytext())); }

<YYINITIAL> {
  \'                             { yybegin(STRING); string.setLength(0); }
}
<STRING> {
  \'                             { yybegin(YYINITIAL);
                                   return sym(STRING_LITERAL, string.toString()); }
  [^\n\r\"\\]+                   { string.append( yytext() ); }
  \\t                            { string.append('\t'); }
  \\n                            { string.append('\n'); }

  \\r                            { string.append('\r'); }
  \\\'                           { string.append('\"'); }
  \\                             { string.append('\\'); }
}

/* operators */
"+" { return sym(PLUS); }
"-" { return sym(MINUS); }
"*" { return sym(TIMES); }
"/" { return sym(DIV); }
"mod" { return sym(MOD); }
"," { return sym(COMMA); }
"=" { return sym(BECOMES); }
"==" { return sym(EQ); }
"!=" { return sym(NEQ); }
"less" { return sym(LT); }
"greater" { return sym(GT); }

/* delimiters */
"<" { return sym(LT); }
">" { return sym(RT); }
":" { return sym(COLON); }

/* identifiers */
{identifier} { return sym(IDENTIFIER, yytext()); }


/* whitespace */
{white}+ { /* ignore */ }

// fallback for invalid syntax
[^] { throw new Error("Unrecognized input: " + yytext()); }
