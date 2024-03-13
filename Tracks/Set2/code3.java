public class code3 {
    public static void main(String[] args) {
        String s1 = "27521";
        String s2 = "7809";
        String s3 = "", s4 = "";
        
        for (int i = 1; i < s1.length(); i += 2) {
            s3 += s1.charAt(i) +""+ s1.charAt(i - 1);
        }
        s3+= s1.length() % 2 != 0? s1.charAt(s1.length()-1):"";
        for(int j = 1;j<s2.length();j+=2){
            s4 += s2.charAt(j) +""+ s2.charAt(j - 1);
        }
        s4+= s2.length() % 2 != 0? s2.charAt(s2.length()-1):"";
        System.out.println(Math.addExact(Integer.parseInt(s3), Integer.parseInt(s4)));
    }
}
