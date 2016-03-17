/**
 * Created by adamhurwitz on 3/10/16.
 */
public class JavaClass {
    static String string = "aabcccccaaa";

    public static void main(String arg[]) {
        System.out.println("Answer is " + compress(string));
    }

    public static String compress(String string) {
        String newString = "";
        int count = 0;
        for (int x = 0; x < string.length() - 1; x++) {
            String temp = string.substring(x);
            if (x > 0){
                if (temp.equals(string.substring(x-1))){
                    count++;
                    newString+= count;
                }
            }
            else {
                newString+= temp;
            }
        }
        return newString;
    }

}
