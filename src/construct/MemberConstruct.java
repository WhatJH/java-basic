package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    // 생성자 추가
    MemberConstruct(String name, int age){
        this(name, age, 50); // 변경 (생성자 안에서만 사용o)
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

/**
 * this() -> 자기 자신의 생성자를 자기 자신의 생성자로 호출하는 것
 * 생성자 안에서만 사용할 수 있다.
 * 생성자에 대한 중복을 제거할 수 있다!
 * 교칙: 생성자 코드의 첫줄에만 작성할 수 있다.
 */
