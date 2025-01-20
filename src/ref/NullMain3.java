package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigdata = new BigData(); // x001
        System.out.println("bigData.count= " + bigdata.count);
        System.out.println("bigData.count= " + bigdata.data);

        // NullPointerException
        System.out.println("bigData.data.value= " + bigdata.data.value);
    }
}
