import java.util.*;

public class count_non_repeated_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            final char c1 = s.charAt(i);
            count = (int) s.chars().filter(ch -> ch == c1).count();
            if (count == 1) {
                c++;
            }
        }
        System.out.println(c);
    }

}