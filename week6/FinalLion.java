// Final class that extends abstract class
final class FinalLion extends Animal {
    public FinalLion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " roars like a Lion!");
    }
}