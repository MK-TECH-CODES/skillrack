import java.util.*;

public class insert_words_lexciorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2[] = s1.split(" ");
        List<String> s = new ArrayList<>(Arrays.asList(s2)); // Create a modifiable ArrayList
        String k = sc.next();
        s.add(k);
        Collections.sort(s);
        for (String k1 : s) {
            System.out.print(k1 + " ");
        }
    }
}
