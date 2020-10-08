public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {

        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < data.length - 1; i++) {
                if (data[i] > data[i + 1]) {
                    temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
}

