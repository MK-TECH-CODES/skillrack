import java.util.*;

public class first_k_integer_sorting {
    public static boolean sorting(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        Arrays.sort(num, 0, n1);
        System.out.println(Arrays.toString(num));
        if (sorting(num)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}