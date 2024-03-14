import java.util.*;

public class find_position_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fl = 0;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i = 0; i < num.size(); i++) {
            if (k == num.get(i)) {
                System.out.print(i + 1 + " ");
                fl = 1;
            }
        }
        if (fl == 0) {
            System.out.println("-1");
        }
    }
}
