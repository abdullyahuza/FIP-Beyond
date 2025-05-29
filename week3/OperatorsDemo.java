public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // Relational
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b? " + (a == b));

        // Logical
        boolean result = (a > 0) && (b > 0);
        System.out.println("Logical AND result: " + result);

        // Assignment
        a += 10;
        System.out.println("a after += 10: " + a);
    }
}
