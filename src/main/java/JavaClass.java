/**
 * Created by adamhurwitz on 3/10/16.
 */
public class JavaClass {
    static String str = "aabcccccaaa";

    public static void main(String arg[]) {
        System.out.println("Answer is " + compress(str));
    }

    public static String compress(String str) {
        String compressed = "";
        int counter = 1;
        for (int n = 1; n <= str.length(); n++){
            if (n == str.length()){
                compressed = compressed + str.substring(n-1,n) + counter;
            }
            else if (!str.substring(n,n+1).equals(str.substring(n-1,n))){
                compressed = compressed + str.substring(n-1,n) + counter;
                counter = 1;
            } else {
                counter++;
            }
        }
        return compressed;
    }

}
