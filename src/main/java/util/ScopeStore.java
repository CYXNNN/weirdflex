package util;

import AST.MethodDecl;
import java.util.Map;

public class ScopeStore {

  public static ScopeStore instance;

  public static  ScopeStore getInstance() {
    if (instance == null) {
      instance = new ScopeStore();
    }

    return instance;
  }

  public Map<String, MethodDecl> functions;
  public Map<String, Object> variables;
  public Map<String, Map<String, Object>> functionVariables;

  public void putVar(String key, Object value) {
    variables.put(key, value);
  }
  public Object getVar(String key) {
    return variables.get(key);
  }


  public void putFunc(String key, MethodDecl value) {
    functions.put(key, value);
  }
  public MethodDecl getFunc(String key) {
    return functions.get(key);
  }

}
