import java.util.*;

public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.print(Math.min(Math.min(s1.charAt(0) - '0', s2.charAt(0) - '0'), s3.charAt(0) - '0'));
        System.out.print(Math.max(Math.max(s1.charAt(1) - '0', s2.charAt(1) - '0'), s3.charAt(1) - '0'));
        System.out.print(Math.min(Math.min(s1.charAt(2) - '0', s2.charAt(2) - '0'), s3.charAt(2) - '0'));
        System.out.print(Math.max(Math.max(s1.charAt(3) - '0', s2.charAt(3) - '0'), s3.charAt(3) - '0'));

    }
}