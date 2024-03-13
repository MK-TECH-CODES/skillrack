import java.util.*;

public class count_n_in_m {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            num1.add(sc.nextInt());
        }
        for (int i = 0; i < n2; i++) {
            num2.add(sc.nextInt());
        }
        int v = 0;
        for (int i = 0; i < num2.size(); i++) {
            final int k = num2.get(i);
            int c = (int) num1.stream().filter(ch -> k == ch).count();
            if (c != 0) {
                v++;
            }
        }
        System.out.println(v);
    }
}
