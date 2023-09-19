public class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();

        int result1 = calc.add(3, 5);
        System.out.println("Result 1: " + result1); // Output: Result 1: 8

        int result2 = calc.add(1, 2, 3);
        System.out.println("Result 2: " + result2); // Output: Result 2: 6

        int result3 = calc.add(1, 2, 3, 4, 5);
        System.out.println("Result 3: " + result3); // Output: Result 3: 15
    }
}
