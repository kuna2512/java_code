public class linearSearch1 {
    public static int LinearSearch(int arr[] ,int key){
        for(int i=0; i<arr.length; i++){
            if (arr[i] ==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]a1={4,6,8,9,10,13,15,17,18,19,20};
                int key=18;
        System.out.println("Element found at index : "+ LinearSearch(a1,key));
    }
}
