import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);
        //This is in ascending order
        int input[][] = {
                {},
                {1, 4, 90, 3, 0, 13, 16},
                {9, 8, 2, 1, 6, 0, 5, 3, 4, 7, 6},
        };

        int output[][] = {
                {},
                {0, 1, 3, 4, 13, 16, 90},
                {0, 1, 2, 3, 4, 5, 6, 6, 7, 8, 9}
        };

        assertEquals(input.length, output.length);
        assertEquals(input.length, output.length);


        for (int i = 0; i < input.length; i++) {
            Problem2.bubbleSort(input[i]);
            //System.out.println(i);//print
            System.out.println("Sorted Array: " + Arrays.toString(input[i]));
        }

    }
}

