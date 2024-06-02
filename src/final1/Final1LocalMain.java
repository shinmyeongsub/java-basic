package final1;

public class Final1LocalMain {
    public static void main(String[] args) {
        //final 지역 변수
        final int data1;
        data1 = 10;
//        data1 = 20;

        final int data2 = 10;
//        data2 = 20;
    }

    static void mehtod(final int parameter) {
//        parameter = 20; // 컴파일 오류
    }
}
