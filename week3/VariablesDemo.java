public class VariablesDemo {
    
    int defaultInt;
    boolean defaultBoolean;
    String defaultString;

    public static void main(String[] args) {
    
        // Variables
        int age = 25;
        double salary = 55000.50;
        boolean isEmployed = true;
        char grade = 'A';
        String name = "Alice";
        int[] scores = {90, 85, 78};

        // Default values
        VariablesDemo obj = new VariablesDemo();
        System.out.println("Default int: " + obj.defaultInt);
        System.out.println("Default boolean: " + obj.defaultBoolean);
        System.out.println("Default String: " + obj.defaultString);

        // Literals
        int bin = 0b1010;
        int hex = 0xFF;
        double sci = 1.2e3;
        char ch = '\u0041';

        System.out.println("Binary: " + bin);
        System.out.println("Hex: " + hex);
        System.out.println("Scientific: " + sci);
        System.out.println("Unicode Char: " + ch);
    }
}
