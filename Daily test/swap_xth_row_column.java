
import java.util.*;

public class swap_xth_row_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[][] = new int[n][n];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        int n1 = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            int v1 = num[i][n1 - 1];
            num[i][n1 - 1] = num[n1 - 1][i];
            num[n1 - 1][i] = v1;
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
