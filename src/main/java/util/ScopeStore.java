package util;

import AST.MethodDecl;
import exception.Error;
import exception.WeirdException;
import java.util.HashMap;
import java.util.Map;

public class ScopeStore {

  public static ScopeStore instance;

  public static  ScopeStore getInstance() {
    if (instance == null) {
      instance = new ScopeStore();
    }

    return instance;
  }

  public static String ctx = "global";
  public Map<String, MethodDecl> functions = new HashMap<>();
  public Map<String, Variable> variables = new HashMap<>();

  public void putVar(String key, Variable var) {
    variables.put(key, var);
  }

  public Variable getVar(String key) {
    var v =  variables.get(key);

    if (v == null) {
      return null;
    }

    if (!ctx.equals("global")) {

      if (!v.ctx.equals(ctx) && !v.ctx.equals("global")) {
        throw new WeirdException(Error.OUT_OF_SCOPE, key);
      }
    }

    return v;

  }

  public void putFunc(String key, MethodDecl value) {
    functions.put(key, value);
  }
  public MethodDecl getFunc(String key) {
    return functions.get(key);
  }

}
