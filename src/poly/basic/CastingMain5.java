package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        // child 인스턴스인 경우 childMethod() 실행
        parent.parentMethod();
        if(parent instanceof Child) {
            System.out.println("Child Instance가 맞다.");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
