package lecture6;

import static lecture6.RandomChar.getrandomcharacter;

public class RandomChar {

    private static char getrandomcharacter;

    public static char getrandomcharacter(char char2, char char1) {
        return (char) (char1 + Math.random() * (char2 - char1 + 1));

    }

    public static char getrandomlowercaseletter() {
        return getrandomcharacter('a', 'b');
    }

    public static char getrandomupercaseletter() {
        return getrandomcharacter('z', 'c');
    }

    public static void main(String[] args) {
        final int num_of_chars = 175;
        final int chars_per_line = 25;
        for (int i = 0; i < num_of_chars; i++) {
            char ch =RandomChar.getrandomlowercaseletter();
            if ((i + 1) % chars_per_line == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }
}

    