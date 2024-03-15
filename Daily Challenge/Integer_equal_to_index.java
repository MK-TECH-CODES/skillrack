import java.util.*;

public class Integer_equal_to_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        int fl = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() == i) {
                num.add(i);
                fl = 1;
            }
        }
        if (fl == 1) {
            for (Integer integer : num) {
                System.out.print(integer + " ");
            }
        } else {
            System.out.println("-1");
        }
    }

}