/**
 * Created by zhuozengsi on 3/16/16.
 *
 * The palindrome string has a symmetrical character.So we can handle with the center index
 * and travel to two side to justify whether equal to each other. We can set an OFFSET to
 * refer to the traveling offset.We also should to notice that the character number of the
 * longest palindrome substring is odd or even.
 */
public class Solution {
    public String longestPalindrome(String s) {
        int size = s.length();
        int lengthOfPalindrome;
        int maxLength = 0;
        int offset;
        String longestPalindrome = null;
        if(s == null || s.equals(""))
            return null;
        else
            longestPalindrome = String.valueOf(s.charAt(0));

        for(int index = 0; index < size - 1; index ++){
            lengthOfPalindrome = 1;

            //if the character number of the longest palindrome is odd

            for(offset = 1; index - offset >=0 && index + offset < size; offset++ ){
                if(s.charAt(index - offset) == s.charAt(index + offset)){
                    lengthOfPalindrome += 2;
                }else {
                    break;
                }
            }
            // the offset will larger 1 than the expected offset.

            if(maxLength < lengthOfPalindrome){
                maxLength = lengthOfPalindrome;
                /**We should return the index of substring is between [index-offset+1, index+offset-1],
                 * but the method substring(int min, int max) is exclusive the max index, so we should
                 * pass the max+1 to the param.
                 * */
                longestPalindrome = s.substring(index - offset + 1, index + offset);
            }

            //if the character number of the longest palindrome is even
            lengthOfPalindrome = 0;
            for(offset = 0; index - offset >= 0 && index + 1 + offset <size; offset ++){
                if (s.charAt(index-offset) == s.charAt(index+1+offset)){
                    lengthOfPalindrome += 2;
                }else {
                    break;
                }
            }

            if(maxLength < lengthOfPalindrome){
                maxLength = lengthOfPalindrome;
                longestPalindrome = s.substring(index - offset + 1, index + offset + 1);
            }


        }

        return longestPalindrome;

    }
}
