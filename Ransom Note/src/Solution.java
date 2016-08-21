/**
 * Created by zhuozengsi on 8/17/16.
 */
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote == null || magazine == null) return false;
        if(ransomNote.length() > magazine.length()) return false;

        StringBuilder builder = new StringBuilder(magazine);
        StringBuffer buffer = new StringBuffer(magazine);

        for(int i = 0; i < ransomNote.length(); i++){

            char c = ransomNote.charAt(i);
            String s = String.valueOf(c);
            int index = -1;
            if((index = builder.indexOf(s)) != -1){
                builder.deleteCharAt(index);
            }else
                return false;

        }

        return true;
    }



}