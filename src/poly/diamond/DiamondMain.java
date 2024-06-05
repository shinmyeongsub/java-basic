package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA childA = new Child();
        InterfaceB childB = new Child();

        childA.methodA();
        childA.methodCommon();

        childB.methodB();
        childB.methodCommon();
    }
}
