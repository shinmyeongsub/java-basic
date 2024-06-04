package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 생성 불가

        AbstractAnimal dog = new Dog();
        AbstractAnimal cat = new Cat();
        AbstractAnimal caw = new Caw();

        animalSound(dog);
        animalMove(dog);

        animalSound(cat);
        animalMove(cat);

        animalSound(caw);
        animalMove(caw);
    }

    public static void animalSound(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    public static void animalMove(AbstractAnimal animal){
        System.out.println("동물 이동 시작");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}
