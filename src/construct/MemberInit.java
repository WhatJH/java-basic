package construct;

public class MemberInit {

    String name;
    int age;
    int grade;


//    추가
     void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}


// this -> 자기 자신의 인스턴스의 참조 값 (자기 자신을 가리킴)
// initMeber는 Member에 초기값 설정 기능을 제공하는 메서드.
// this를 빼버리면 값이 세팅이 안 된다. (null)
