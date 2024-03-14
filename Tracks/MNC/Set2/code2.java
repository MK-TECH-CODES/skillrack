public class code2 {
    public static void exe() {
        try {
            Thread.sleep(50);
            String s = "1634";
            int sum = 0, i = 0;
            int even = 0;
            int odd = 0;
            while (i < s.length()) {
                int v = s.charAt(i) - '0';
                sum += (int) Math.pow(v, s.length());
                if ((v % 2) == 0) {
                    even += v;
                } else {
                    odd += v;
                }
                i++;
            }
            System.out.println(sum == Integer.parseInt(s)? even: odd);
        } catch (Exception e) {
            System.out.println("50 ms is limit");
        }
    }

    public static void main(String[] args) {
        exe();
    }
}
