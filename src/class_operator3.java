public class class_operator3 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(a == b && a != b);   // 10==20
        System.out.println(a == b || a != b);   // 10==20 || 10!20
        System.out.println(!(a > b));     // 10>20 ===> false.
    }
}
