import java.util.*;

public class count_unique_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> str = new ArrayList<>();
        List<String> remove = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            if (!str.contains(s1)) {
                str.add(s1);
            } else {
                remove.add(s1);
            }
        }
        for (String s1 : remove) {
            str.remove(s1);
        }
        System.out.print(str.size());
    }
}
