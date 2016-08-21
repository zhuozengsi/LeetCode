import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
//        for(int i = 0; i < charS.length; i ++){
//
//            if(charS[i] != charT[i])
//                return false;
//
//        }
        s = String.valueOf(charS);
        t = String.valueOf(charT);

        return s.equals(t);

    }


}
