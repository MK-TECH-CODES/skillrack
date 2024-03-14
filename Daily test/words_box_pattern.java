import java.util.*;

public class words_box_pattern {
    public static void p1(List<String> s) {
        System.out.print("+");
        for (int i = 0; i < s.size(); i++) {
            for (int j = 0; j < s.get(i).length(); j++) {
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> str1 = Arrays.asList(str.split(" "));
        p1(str1);
        System.out.print("|");
        for (String string : str1) {
            System.out.print(string + "|");
        }
        System.out.println();
        p1(str1);
    }
}
