package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생1";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[]{student1, student2};

        for ( int i  = 0; i < students.length; i++)
            System.out.println("이름:" + students[i].name + "나이:" + students[i].age + "성적:" + students[i].grade);
    }
}

// 배열에서 new 를 쓰는 건 메모리상에 뭔가 만들기 때문.
// 참조값을  반환한다. (어디 담아 놓고 사용)
// 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다. (절대로 인스턴스를 복사하지 않는다.)
// 주의 !!
// 자바에서 변수 대입은 모두 변수에 들어있는 값을 복사해서 전달하는 것이다.
// 배열 [] / 객체 . 으로 접근한다.


/**
 * 기본형: 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입
 * 참조형: 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입
 *
 * 래퍼런스 -> 참조하다
 * 참조형 변수는 참조 값이 들어있음
 * 참조값을 통해 실체가 있는 곳을 이동해야함
 * 참조형에는 객체, 배열이 있다.
 *
 * 기본형은 들어있는 값을 그대로 계산에 사용할 수 있다
 * 참조형은 주소지만 가지고 할 수 없음, 주소지에 가야 실체가 있음.
 * 참조값만 가지곤 계산 못한다.
 *
 * 기본형을 제외한 나머지는 모두 참조형이다
 * int, long, double, boolean 모두 소문자로 시작함.
 * 개발자는 참조형인 클래스만 직접 정의할 수 있다.
 *
 * String은 참조형이지만 기본형처럼 문자 값을 대입할 수 있음 (매우 자주 다룸, 자바에서 특별한 편의 기능을 제공함)
 *
 *
 */