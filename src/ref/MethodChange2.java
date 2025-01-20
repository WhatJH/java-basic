package ref;

public class MethodChange2 {

    public static void main(String[] args){
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);

        changeReference(dataA);

        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);

    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }


}

// 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 메서드 내부에서 매개변수의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
// 메서드로 참조형 데이터를 전달하면, 참조 값이 복사되어 전달된다. 메서드 내부에서 매개변수로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.