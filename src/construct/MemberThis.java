package construct;

public class MemberThis {
    String nameField;

    // 지역변수와 멤버 변수의 이름이 다르면 사용 가능.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
