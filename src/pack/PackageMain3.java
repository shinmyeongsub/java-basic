package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User userA = new User(); // import 사용으로 패키지 명 생략 가능
        pack.b.User userB = new pack.b.User();
    }
}
