package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;
    }
}

    /**
    NameParameterfmf scope상 가까움.
    nameFiled를 찾는다 scope상에 없음(지역 변수에 없다) -> 자신의 멤버 변수 거를 가져다 쓰게 됨.
    이런 경우 this가 생략되어 있음.
    */



