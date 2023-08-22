package lecture6;

public class GetGrade2 {

    public static void main(String[] args) {
        System.out.println("the grade is");
        getgrade(78.5);
        System.out.println("the grade is ");
        getgrade(80.6);
    }

    public static void getgrade(double score) {
        if (score >= 90) {
            System.out.println("a");
        } else if (score >= 80) {
            System.out.println("b");
        } else if (score >= 70) {
            System.out.println("c");
        }

    }

}
