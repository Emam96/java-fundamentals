
package linter;

import java.io.BufferedReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class App {




    public static void main(String[] args) {

        linter("C:\\Users\\STUDENT\\Desktop\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\gates.js");


    }

    public static void linter(String path) {

        Path thePath = Paths.get(path);
        try {
            BufferedReader reader = Files.newBufferedReader(thePath);
            String line = reader.readLine();
            int NumberOfLine = 1;
            while (line != null) {
                if (!(line.matches("(?s).*(?:;|\\bTHEN|\\bBEGIN)$")) &&
                        !(line.matches("(?s).*(?:}|\\bTHEN|\\bBEGIN)$")) &&
                        !line.contains("{") &&
                        !line.isEmpty() &&
                        !line.contains("if") &&
                        !line.contains("else") ) {
                    System.out.println("Line " + NumberOfLine + " is Missing a semicolon.");
                }
                line = reader.readLine();
                NumberOfLine++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
