import java.util.*;

public class minium_profit_n_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < num[0].length; i++) {
            List<Integer> k = new ArrayList<>();
            for (int j = 0; j < num.length; j++) {
                k.add(num[j][i]);
            }
            Collections.sort(k);
            System.out.print(k + " ");
        }
    }
}
