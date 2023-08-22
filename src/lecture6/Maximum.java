package lecture6;

public class Maximum {

    public static void main(String[] args) {
      int i = 4;
     int j = 6;
     int z = max(i, j);
       System.out.println("maximum between " + i + "and" + j + "is" + z);
  }

    public static int max(int i1, int i2) {
        int result = 0;
        if (i1 > i2) {
            result = i1;
        } else {
            result = i2;
        }
        return result;

    }
}
