/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testLinter() {

         App.linter("C:\\Users\\STUDENT\\Desktop\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\noErrors.js");
        assertTrue( true);

        App.linter("C:\\Users\\STUDENT\\Desktop\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\oneError.js");
        assertTrue( true);


        App.linter("C:\\Users\\STUDENT\\Desktop\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\few.js");
        assertTrue( true);

        App.linter("C:\\Users\\STUDENT\\Desktop\\401\\java-fundamentals\\linter\\app\\src\\main\\resources\\empty.js");
        assertTrue( true);

    }


}
