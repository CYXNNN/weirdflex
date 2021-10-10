# WeirdFlex
WeirdFlex is a small programming language based on jFlex integrated with Maven

## Syntax

### Variables
<pre> var identifier = value</pre>

### Functions
<pre>func foo&#60;a, b&#62;:
  #doStuff
  return bar
end</pre>

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


## Installation
For generating the necessary files simply run "mvn clean install"
