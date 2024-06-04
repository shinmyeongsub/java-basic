package poly.ex4;

// 순수 추상 클래스 -> 추상 메서드만 갖고 있음
public abstract class AbstractAnimal {
    // 추상 클래스의 추상 메서드는 강제적으로 메서드를 오버라이딩하게 만듬
    public abstract void sound();
    public abstract void move();
}
