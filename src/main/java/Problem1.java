

public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {

        int firstIndex = 0;
        int lastIndex = data.length - 1;
        int elementPos = -1;

        //If the first index is less then last index run code
        while (firstIndex <= lastIndex) {

            int midIndex = (firstIndex + lastIndex) / 2;
            if (target == data[midIndex]) {//If the target equals middle quit.
                elementPos = midIndex;
                break;
            } else if (target < data[midIndex]) {
                lastIndex = midIndex - 1;
            } else if (target > data[midIndex]) {
                firstIndex = midIndex + 1;
            }
        }
        return elementPos;
    }
}
