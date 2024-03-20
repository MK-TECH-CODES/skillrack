import java.io.*;
import java.util.*;

public class Message_encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        char c[][] = new char[s.length() / n][n];
        int c1 = 0;
        int v = 0;
        for (int i = 0; i < s.length() / n; i++) {
            if ((i & 1) == 0) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j] = s.charAt(v);
                    v++;
                }

            } else {
                for (int j = c[0].length - 1; j >= 0; j--) {
                    c[i][j] = s.charAt(v);
                    v++;
                }
            }
        }
        for (int i = 0; i < c[0].length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[j][i]);
            }
        }
    }
}