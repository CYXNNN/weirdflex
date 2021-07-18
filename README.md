# WeirdFlex
WeirdFlex is a small programming language based on jFlex integrated with Maven

## Syntax

### Variables
<pre>identifier = value</pre>

### Functions
<pre>func foo<a, b>:
  #doStuff
  return bar
end</pre>

### If
<pre>if\<expression\>:
  #doStuff
else
  #doStuff
end</pre>

### While
<pre>aslong\<expression\>:
  #doStuff
end</pre>

### Debugging
<pre>
showme\<expression\>
</pre>


## Installation
for generating the necessary files simply run "mvn clean install"
