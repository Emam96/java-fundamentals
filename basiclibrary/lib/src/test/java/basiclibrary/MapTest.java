package basiclibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {


    @Test
    public void testMax() {

        int[][] arr = {
                {1,2,4,4},
                {5,4,8,6},
                {10,8,9,6},
                {2,8,9,7}
        };

        int passedValue = Maps.getMaxValue(arr);
        assertEquals( 10, passedValue);

    }

    @Test
    public void testMin() {

        int[][] arr = {
                {1,2,4,4},
                {5,4,8,6},
                {10,8,9,6},
                {2,8,9,7}
        };

        int passedValue = Maps.getMinValue(arr);
        assertEquals( 1, passedValue);

    }



    @Test
    public void testTally() {

        String[] arr = {"emam", "emam", "emam", "someone"};

        String passedValue = Maps.tally(arr);
        assertEquals( "emam", passedValue);

    }



}
