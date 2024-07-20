/**
 * Compress a String
 */
public class CompressString {
    public static void main(String[] args) {
        String s = "aaabbbbbbbbceeeeisssllaaaaabbbbrr"; 
        String s2 = "";
        char[] ch = s.toCharArray();
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            if( i+1 < s.length() && ch[i]==ch[i+1]){
                counter += 1;
            } else {
                s2 += ch[i];
                if(counter >1){
                    s2 += counter;
                }
                counter = 1;
            }
        }
        System.out.println(s2); 
    }
}
