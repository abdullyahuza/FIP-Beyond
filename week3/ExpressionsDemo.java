public class ExpressionsDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        // Expression
        int sum = x + y;

        // Statement
        System.out.println("Sum = " + sum);

        // Block
        {
            int product = x * y;
            System.out.println("Product in block = " + product);
        }
    }
}
