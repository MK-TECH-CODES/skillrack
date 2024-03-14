import java.util.*;

public class digits_to_matrix_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = n.charAt(0) - '0';
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < n.length(); j++) {
                for (int j2 = 0; j2 < count; j2++) {
                    System.out.print(n.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
