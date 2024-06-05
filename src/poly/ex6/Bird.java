package poly.ex6;

// extends를 통한 상속은 하나만, implements는 무제한
public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
