public class hierarchyOfOperators_17 {
    public static void main(String[] args) {
        int i =2, j =4, k, l;
        double a,b;
        k = i/j*j;
        l = j/i*i;
        a = i/j*j;
        b = j/i*i;
        System.out.println(k+" "+l+" "+a+" "+b);
    }
}
