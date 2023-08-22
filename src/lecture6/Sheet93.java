package lecture6;

import java.util.Scanner;

public class Sheet93 {

    public static void main(String[] args) {

    }
    Scanner sc = new Scanner(System.in);

    public static void max(int value1, int value2, int max) {
        if (value1 > value2) {
            max = value1;
        } else {
            max = value2;

        }
        System.out.print(max);
    }
}
