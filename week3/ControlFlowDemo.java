public class ControlFlowDemo {
    public static void main(String[] args) {
        int age = 20;
        char grade = 'B';
        int[] numbers = {1, 2, 3, 4, 5};

        // if-else
        if (age >= 18) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You are a minor.");
        }

        // switch
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Very good!");
                break;
            default:
                System.out.println("Needs improvement.");
        }

        // while loop
        int start = 1;
        int sum = 0;
        while (start <= 10) {
            sum = sum + start;
            System.out.println("I (while): " + start);
            System.out.println("Sum: " + sum);
            start++;
        }

        // for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number (for): " + numbers[i]);
        }

        // break and continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            if (i == 5) break;
            System.out.println("Loop value: " + i);
        }
    }
}
