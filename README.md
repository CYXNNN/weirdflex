# WeirdFlex
WeirdFlex is a small programming language based on jFlex integrated with Maven

## Syntax

### Variables
<pre> var identifier = value</pre>
<pre> var identifier</pre>

If no value expression is specified the value will be null.

### Functions
<pre>func foo&#60;a, b&#62;:
  #doStuff
  return bar
end</pre>

or

<pre>func foo&#60;a, b&#62;:
  #doStuff
end</pre>

A function may not implement a return statement

### If
<pre>if&#60;expression&#62;:
  #doStuff
else
  #doStuff
end</pre>

or

<pre>if&#60;expression&#62;:
  #doStuff
end</pre>

### Comparison
<pre>Expression == Expression</pre>
Evaluates to true if the values of two expressions evaluated to the same

<pre>Expression != Expression</pre>
Evaluates to true if the two expressions evaluated to different values

<pre>Expression less Expression</pre>
Evaluates to true if the numeric expression on the left is less than the numerical value on the right

<pre>Expression greater Expression</pre>
Evaluates to true if the numeric expression on the left is greater than the numerical value on the right
### While
<pre>aslong&#60;expression&#62;:
  #doStuff
end</pre>

### Arithmetic operators
<pre>
+ = addition
- = subtraction
* = multiplication
/ = division
mod = modulo
</pre>

### Debugging
<pre>
showme&#60;expression&#62;
</pre>
logs an expression to the console

## Semantic Errors
<pre>
DEFAULT
PARAM -> number of parameters missmatch
UNKNOWN_METHOD -> a non defined method is called
DIVISON_BY_ZERO -> division by zero
VAR_DECL_EXISTS -> variable declared more than once
VAR_DECL_NOT_EXISTS -> accessed a variable which is not defined
NULL -> something is null which should not be
NOT_NUMERICAL -> mathematical operation on non numeric values
OUT_OF_SCOPE -> accessed a variable which is not declared for the current scope
RESERVED_WORD -> a reserved word was used as identifier
</pre>

## Installation
For generating the necessary files simply run "mvn clean install".
And btw. the target directory was commited on purpose.
