public class LinearSearchTimeExecution {
    public static int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a1 = {3, 5, 9, 7, 22, 23,78,90,78,00,23,22,434,668,890,89799};
        int key = 9899;
        //long startTime  = System.currentTimeMillis();
        long startTime = System.nanoTime();
        int result = LinearSearch(a1, key);
        // long endTime  = System.currentTimeMillis();
        long endTime = System.nanoTime();
        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
        float executionTime = (endTime - startTime)/1000F;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        System.out.println("Start time: " + startTime + " nanoseconds");
        System.out.println("End time: " + endTime + " nanoseconds");
    }

}
