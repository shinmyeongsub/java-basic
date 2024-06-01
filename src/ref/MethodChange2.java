package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("method 호출 전, dataA.value : " + dataA.value);
        System.out.println(dataA);
        changeReference(dataA);
        System.out.println("method 호출 후, dataA.value : " + dataA.value);
    }

    static void changeReference(Data data) {
        System.out.println(data);
        data.value = 20;
    }
}
