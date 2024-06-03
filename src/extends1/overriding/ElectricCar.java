package extends1.overriding;

// Car 상속
public class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }

    @Override
    public void move(){
        System.out.println("조금 더 빠르게 움직입니다.");
    }
}
