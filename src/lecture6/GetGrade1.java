package lecture6;

public class GetGrade1 {

    public static void main(String[] args) {
        System.out.print("the grade is" + getgrade(78.5));

        System.out.print("\n the grade is " + getgrade(80.5));

    }

    public static char getgrade(double score) {
        if (score >= 90) {
            return ('a');
        } else if (score >= 80) {
            return ('b');
        } else {
            return ('c');
        }

    }

}
