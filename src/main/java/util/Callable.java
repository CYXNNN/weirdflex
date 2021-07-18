package util;

import AST.FormalList;

public interface Callable {
  Object call(FormalList params);
}
