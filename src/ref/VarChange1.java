package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a =10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 값을 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 값을 변경
        b = 30;
        System.out.println("변경 = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}

// a에 있는 값을 복사해서 b로 전달한다
// b가 바뀐 것이 아니다.