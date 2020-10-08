import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        //assertTrue(false);

        int input[][] = {
                {},
                {1, 4, 90, 3, 0, 13, 16},
                {9, 8, 2, 1, 6, 0, 5, 3, 4, 7, 6},
        };

        int output[][] = {
                {},
                {0, 1, 3, 4, 13, 16, 90},
                {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

        assertEquals(input.length, output.length);
        assertEquals(input.length, output.length);

        /*
        for (int i = 0; i < input.length; i++) {
            int temp = Problem2.bubbleSort(input[i]);
            int expected = output[i];
            assertEquals(expected, temp);
        }
*/
        for (int i = 0; i < input.length; i++) {
            int temp = Problem2.bubbleSort(input[i]);

        for (int i = 0; i < input.length; i++) {
            if(!Arrays.equals(input[i],output[i])){
                System.out.println(i);
                System.out.println(Arrays.toString(output[i]));
                System.out.println(Arrays.toString(input[i]));
            }
        }

    }
}

