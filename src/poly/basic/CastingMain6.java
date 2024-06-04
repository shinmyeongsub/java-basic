package poly.basic;

// Java 16 Pattern Matching for Instance
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        call(parent1);
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent) {
        // child 인스턴스인 경우 childMethod() 실행
        parent.parentMethod();
        if(parent instanceof Child child) {
            System.out.println("Child Instance가 맞다.");
            child.childMethod();
        }
    }
}
