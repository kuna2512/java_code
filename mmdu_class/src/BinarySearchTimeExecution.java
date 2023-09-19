public class BinarySearchTimeExecution {
    public static int BinarySearch(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a1 = {3, 5, 9, 7, 22, 33};
        int key = 22;
        java.util.Arrays.sort(a1);

        long startTime = System.nanoTime();
        int result = BinarySearch(a1, key);

        long endTime = System.nanoTime();

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }

        long executionTime = (endTime - startTime) / 1000;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}
