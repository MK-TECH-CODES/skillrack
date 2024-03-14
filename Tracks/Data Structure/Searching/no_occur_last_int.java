import java.util.*;

public class no_occur_last_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        int c = (int) num.stream().filter(ch -> num.get(n - 1).equals(ch)).count();
        System.out.println(c);
    }
}
