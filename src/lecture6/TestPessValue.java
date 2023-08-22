package lecture6;

public class TestPessValue {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("before the swap ihe num1 is" + num1 + "the num2 is" + num2);
        swap(num1, num2);
        System.out.println("after the swap num1 is" + num1 + "num2 is" + num2);

    }

    public static void swap(int num1, int num2) {
        System.out.println("before swaping num1 is" + num1 + "num2 is" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("after swapping num1 is" + num1 + "num2 is" + num2);
    }
}
