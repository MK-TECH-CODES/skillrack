import java.util.*;

public class first_occur_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int fl = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".contains(String.valueOf(s.charAt(i)))) {
                System.out.print(s.charAt(i));
                fl = 1;
                break;

            }
        }
        if (fl == 0) {
            System.out.println("-1");
        }
    }
}
