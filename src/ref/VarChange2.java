package ref;

public class VarChange2 {

    public static void main(String[] args){
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;
//        참조 값만 읽어서 b에 들어가는 것이다.

        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value= 20;
        System.out.println("변경 dataA.value = " + dataA.value);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        // a를 바꾸면 b도 바뀌게 된다. (실제로는 바뀐거처럼 보이는 것이다)

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        // Data dataB =  dataA
        // 같은 인스턴스를 바라보게 된다.

        // 핵심!
        // Data dataB = dataA 일때, 변수에 들어있는 값을 복사해서 사용한다는 점


    }
}



// 메서드를 호출할 때 사용하는 매개변수(파라미터)도 결국 변수이다
// 메서드를 호출할 때 매개변수에 전달 하는 값도 값을 복사해서 전달한다