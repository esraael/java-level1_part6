package lecture6;

import java.util.Scanner;

public class HexToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the hex digit:");
        String hexString = sc.nextLine();
        if (hexString.length() != 1) {
            System.out.println("you must enter exactly one character");
            System.exit(1);

        }
        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch <= 'f' && ch >= 'a') {
            int value = ch - 'a' + 10;
            System.out.println("the decimal value for hex digit" + ch + "is" + value);

        } else if (Character.isDigit(ch)) {
            System.out.println("the decimal value for hex digit" + ch + "is" + ch);
        } else {
            System.out.println(ch + "is an invalid input");
                   
        }
    }
}
