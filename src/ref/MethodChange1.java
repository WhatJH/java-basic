package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a= 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후: a = " + a);


    }

    static void changePrimitive(int x) {
        x = 20;
    }

}

// 메서드를 호출할 때 매개변수 x에 매개변수 a의 값을 전달한다.
// 메서드 사용이 끝나면 매모리에서 제거가 된다.
