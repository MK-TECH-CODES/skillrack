import java.util.*;

public class Integer_exactly_3_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Set<Integer> num = new HashSet<>();
        while (n != 0) {
            num.add((int) (n % 10));
            n /= 10;
        }
        if (num.size() == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}