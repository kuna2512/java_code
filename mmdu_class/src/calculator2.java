public class calculator2 {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        double num3 = 2.5;
        double num4 = 1.5;

        System.out.println("Addition (int): " + add(num1, num2));
        System.out.println("Addition (double): " + add(num3, num4));

        System.out.println("Subtraction (int): " + subtract(num1, num2));
        System.out.println("Subtraction (double): " + subtract(num3, num4));

        System.out.println("Multiplication (int): " + multiply(num1, num2));
        System.out.println("Multiplication (double): " + multiply(num3, num4));

        System.out.println("Division (int): " + divide(num1, num2));
        System.out.println("Division (double): " + divide(num3, num4));
    }
}
