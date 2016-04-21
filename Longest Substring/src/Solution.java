import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhuozengsi on 3/9/16.
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<>();
        int lastLocation = 0;
        int maxLength = 0;
        int sizeOfString = s.length();
        for (int i = 0; i < sizeOfString; i++){
            if(list.contains(s.charAt(i))){
                int index = list.indexOf(s.charAt(i));
                list = list.subList(index+1, list.size());
                maxLength = i - lastLocation > maxLength ? i - lastLocation : maxLength;
                lastLocation = i;
            }

            list.add(s.charAt(i));
        }
        return maxLength > list.size() ? maxLength:list.size();


    }

    public static void main(String[] args){
        Solution solution = new Solution();
        String str = "abbcdef";
        System.out.println(solution.lengthOfLongestSubstring(str));
    }
}
