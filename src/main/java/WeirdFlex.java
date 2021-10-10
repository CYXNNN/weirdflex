import AST.Program;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.net.URL;

public class WeirdFlex {
  public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
    Reader reader;
    File input;


    if (args.length > 0) {
      input = getFile(args[0]);
    } else {
      input = getFile("testfile.wfx");
    }

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

  private static File getFile(String name) throws URISyntaxException {
    URL resource = WeirdFlex.class.getClassLoader().getResource(name);
    if (resource == null) {
      throw new IllegalArgumentException("file not found!");
    } else {
      return new File(resource.toURI());
    }
  }
}
