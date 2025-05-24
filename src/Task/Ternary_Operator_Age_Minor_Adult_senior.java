package Task;

public class Ternary_Operator_Age_Minor_Adult_senior {
    public static void main(String[] args) {
        int age = 7;
        String age_group = age < 18 ? "Minor" : (age <= 65 ? "Adult" : "Senior Citizen");
        System.out.println(age_group);
    }
}
