import java.util.*;

public class sum_of_2_int_equal_to_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int k = sc.nextInt();
        int num[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            num[i] = sc.nextInt();
        }
        int fl = 0;
        for (int i = 0; i < n1 - 1; i++) {
            for (int j = i + 1; j < n1; j++) {
                if (num[i] + num[j] == k) {
                    System.out.println("yes");
                    fl = 1;
                    return;
                }
            }
        }
        if (fl == 0) {
            System.out.println("no");
        }
    }
}
