import java.util.Arrays;

public class ArraysExample {

    public static short size = 8;
    public static int[][] ints = new int[size][];
    public static void main(String[] args) {
        ints[0] = new int[]{1};
        ints[1] = new int[]{1,1};

        for(int i = 2; i < size; i++)
        {
            ints[i] = new int[i+1];
            ints[i][0] = 1;
            for (int j = 1; j<i; j++)
            {
                ints[i][j] = ints[i-1][j-1] + ints[i-1][j];
            }
            ints[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}

