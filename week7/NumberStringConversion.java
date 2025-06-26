
public class NumberStringConversion {
    public static void main(String[] args) {
        // Convert number to string
        int number = 1234;
        String numberAsString = String.valueOf(number);
        System.out.println("Number to String: " + numberAsString);

        // Convert string back to number
        String str = "5678";
        int stringAsNumber = Integer.parseInt(str);
        System.out.println("String to Number: " + stringAsNumber);
    }
}