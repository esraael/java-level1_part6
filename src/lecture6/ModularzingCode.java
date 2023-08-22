package lecture6;

import java.util.Scanner;
import static lecture6.ModularzingCode.gcd;

public class ModularzingCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n1");
        int n1 = sc.nextInt();
        System.out.println("Enter n2");
        int n2 = sc.nextInt();
        System.out.println("the greats common division is " + n1 + "and " + n2 + "is" + gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        int gcd = 1;
        int k = 2;
        while (k < n1 && k < n2) {

            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;

        }
        return gcd;
    }

}
