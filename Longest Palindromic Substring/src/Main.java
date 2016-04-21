/**
 * Created by zhuozengsi on 3/16/16.
 */
public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "aa";
        String longestPalindrome = solution.longestPalindrome(s);
        System.out.println(s);
        System.out.println(longestPalindrome);
        char[] c = new char[2];
        System.out.println(c[0] + " " + c[1]);
    }
}
