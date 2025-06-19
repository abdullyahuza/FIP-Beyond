class Dog extends Animal {

    // Field hiding
    private String name = "Dog";

    public Dog(String name) {
        super(name);
    }

    // Overriding method
    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Woof!");
    }

    // Static method (method hiding, not overriding)
    public static void type() {
        System.out.println("Dog static type");
    }

    public void showNames() {
        System.out.println("this.name: " + this.name);      // Refers to Dog's field
        System.out.println("super.name: " + super.name);    // Refers to Animal's field
    }
}