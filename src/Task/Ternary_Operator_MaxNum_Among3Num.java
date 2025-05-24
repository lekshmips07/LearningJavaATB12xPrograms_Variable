package Task;

public class Ternary_Operator_MaxNum_Among3Num {
    public static void main(String[] args) {

        int a = 100;
        int b = 50;
        int c = 30;
        //String large = a > b ? (a > c ? "Max value is a" : "Max value is c") : "Max value is b";
        //String large = a > b ? "Max value is a" : "Max value is b";
        String large = a > b ? "Max value is a" : (b > c ? "Max value is b" : "Max value is c");
        System.out.println(large);
    }
}
