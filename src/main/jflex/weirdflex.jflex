import java_cup.runtime.Symbol;

%%
%class WeirdScanner
%cup
%implements sym

%{
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
%%

{comment} { /* ignore */ }

/* reserved words */
/* (put here so that reserved words take precedence over identifiers) */

/* types */
"true" { return sym(TRUE); }
"false" { return sym(FALSE); }

/* control flow */
"func" { return sym(FUNC); }
"end" { return sym(END); }
"if" { return sym(IF); }
"else" { return sym(ELSE); }
"aslong" { return sym(WHILE); }
"return" { return sym(RETURN); }
"showme" { return sym(PRINT); }


/* literals */
{digit}+ { return sym(INTEGER_LITERAL, new Integer(yytext())); }
{text} { return sym(STRING_LITERAL, new String(yytext())); }

/* operators */
"+" { return sym(PLUS); }
"-" { return sym(MINUS); }
"*" { return sym(TIMES); }
"/" { return sym(DIV); }
"mod" { return sym(MOD); }
"," { return sym(COMMA); }
"=" { return sym(BECOMES); }
"==" { return sym(EQ); }

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
