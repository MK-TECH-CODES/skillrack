import java.util.*;
import java.util.stream.*;

public class Mininum_distance_between_the_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1[] = sc.nextLine().split(" ");
        String s2 = sc.next();
        String s3 = sc.next();
        int index[] = IntStream.range(0, s1.length).filter(i -> s1[i].equals(s2)).toArray();
        int index1[] = IntStream.range(0, s1.length).filter(i -> s1[i].equals(s3)).toArray();
        int min = Integer.MAX_VALUE;
        for (int j : index) {
            for (int k : index1) {
                min = Math.min(Math.abs(j - k), min);
            }
        }
        System.out.println(min);

    }
}
