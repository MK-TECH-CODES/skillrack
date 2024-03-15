import java.util.*;

public class barcode_no_odd_id {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        Arrays.sort(c);
        System.out.println(c[0]);
    }
}
