package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); // 부모의 생성자가 하나도 없는 경우 기본 생성자가 자동으로 만들어짐
        System.out.println("ClassC 생성자");
    }
}
