abstract class Animal {
    protected String name = "Unknown Animal";

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method to be overrided
    public abstract void makeSound();

    // Final method (cannot be overridden)
    public final void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // Static method (method hiding demo)
    public static void type() {
        System.out.println("Animal static type");
    }
}