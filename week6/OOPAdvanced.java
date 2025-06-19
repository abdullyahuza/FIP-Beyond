
public class OOPAdvanced {

    // Static nested class
    static class StaticNested {
        public void greet() {
            System.out.println("Hello from Static Nested Class!");
        }
    }

    // Non-static inner class
    class Inner {
        public void greet() {
            System.out.println("Hello from Inner Class!");
        }
    }

    public void showInfo() {
        System.out.println("Instance method in main class.");
    }

    public static void staticInfo() {
        System.out.println("Static method in main class.");
    }

    public void anonymousDemo() {
        Animal cat = new Animal("Cat") {
            @Override
            public void makeSound() {
                System.out.println(name + " says: Meow!");
            }
        };
        cat.makeSound();
        cat.sleep();
    }

    public static void main(String[] args) {
        OOPAdvanced demo = new OOPAdvanced();

        demo.showInfo();
        OOPAdvanced.staticInfo();

        // Nested class demo
        StaticNested sn = new StaticNested();
        sn.greet();

        Inner in = demo.new Inner();
        in.greet();

        // Anonymous class
        demo.anonymousDemo();

        // Polymorphism
        Animal dog = new Dog("Bingo");
        dog.makeSound();  // Woof!
        dog.sleep();

        // Method hiding
        Dog.type();       
        Animal.type();    

        // Field hiding demo
        Dog d = new Dog("Scooby");
        d.showNames();

        // Final class demo
        FinalLion lion = new FinalLion("Simba");
        lion.makeSound(); // Simba roars
        lion.sleep();

        if (lion instanceof Animal) {
            System.out.println("FinalLion is an Animal.");
        }
    }
}
