import java.io.*;
import java.util.*;

public class words_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s.length() + "\n" + s1.length);
    }
}