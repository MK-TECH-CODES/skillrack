import java.util.*;

public class shortest_and_second_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Long> n1 = new HashSet<>();
        for (int i = 0; i < n; i++) {
            n1.add(sc.nextLong());
        }
        List<Long> num = new ArrayList<>(n1);
        Collections.sort(num);
        if (num.size() == 1) {
            System.out.println("Equal");
        } else {
            System.out.println(num.get(0) + " " + num.get(1));
        }
    }
}
