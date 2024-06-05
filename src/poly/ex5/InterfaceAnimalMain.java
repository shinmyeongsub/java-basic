package poly.ex5;

public class InterfaceAnimalMain {
    public static void main(String[] args) {
        InterfaceAnimal dog = new Dog();
        InterfaceAnimal cat = new Cat();
        InterfaceAnimal caw = new Caw();

        InterfaceAnimal[] animals = {dog, cat, caw};

        for (InterfaceAnimal animal : animals) {
            animal.sound();
            animal.move();
        }
    }
}
