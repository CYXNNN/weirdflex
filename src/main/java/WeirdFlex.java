import AST.Program;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class WeirdFlex {
  public static void main(String[] args) throws FileNotFoundException {
    Reader reader = null;

    File input = new File("testfile.txt");
    if (!input.canRead()) {
      System.err.println("Error: could not read [" + input + "]");
    }
    reader = new FileReader(input);

    var scanner = new WeirdScanner(reader); // create scanner
    parser parser = new parser(scanner); // create parser
    Program program = null;

    try {
      program = (Program) parser.parse().value; // parse
    } catch (Exception e) {
      e.printStackTrace();
    }

    program.execute();

  }
}
