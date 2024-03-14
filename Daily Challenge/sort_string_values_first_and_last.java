import java.util.*;

public class sort_string_values_first_and_last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> str = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str.add(sc.next());
        }
        Collections.sort(str);
        System.out.println(str.get(0));
        System.out.println(str.get(n - 1));
    }
}