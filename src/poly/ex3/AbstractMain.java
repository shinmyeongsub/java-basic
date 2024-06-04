package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 생성 불가

        AbstractAnimal dog = new Dog();
        AbstractAnimal cat = new Cat();
        AbstractAnimal caw = new Caw();

        animalSound(dog);
        dog.move();

        animalSound(cat);
        cat.move();

        animalSound(caw);
        caw.move();
    }

    public static void animalSound(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
