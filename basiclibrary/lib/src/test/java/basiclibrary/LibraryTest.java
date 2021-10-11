
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    // @Test
    // void testRoll() {
    //     int[] sampleThree = { 1, 2, 3 };
    //     Main classUnderTest = new Main();
       
    //  int   arrayLength =  classUnderTest.roll(5);


    // }
}
