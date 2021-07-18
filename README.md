# WeirdFlex
WeirdFlex is a small programming language based on jFlex.

## Syntax

### Variables
<pre><code>identifier = value</code></pre>

### Functions
<pre><code>func foo<a, b>:
  #doStuff
  return bar
end</code></pre>

### If
<pre><code>if<x == b>:
  #doStuff
else
  #doStuff
end</code></pre>

###While
<pre><code>aslong<x == y>:
  #doStuff
end</code></pre>

## Installation
for generating the necessary files simply run "mvn clean install"
