import java.util.HashMap;

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
        HashMap<String, Integer> lCount = new HashMap<String, Integer>();
        int duplicate = 2;

        for (int n = 0; n < str.length(); n++) {

            String c = str.substring(n, n + 1);

            if (lCount.get(c) == null) {
                lCount.put(c, 1);
            }
            /*else if (!c.equals(str.substring(n - 1, n)) && lCount.get(c) != null) {
                lCount.put(c + String.valueOf(duplicate), 1);
            }*/
            /*else if (lCount.get(c) != null && c.equals(str.substring(n - 1, n))){
                lCount.put(c + String.valueOf(duplicate),
                        lCount.get(c + String.valueOf(duplicate))+1);
            } */
            else {
                lCount.put(c, lCount.get(c) + 1);
            }
            System.out.println("length of : " + c + " is " + lCount.get(c));
        }

        for (HashMap.Entry<String, Integer> e : lCount.entrySet()) {
            if (e.getKey().length() > 1) {
                compressed = compressed + e.getKey().substring(0,1) + String.valueOf(e.getValue());
            } else {
                compressed = compressed + e.getKey() + String.valueOf(e.getValue());
            }
        }
        return compressed;
    }

}
