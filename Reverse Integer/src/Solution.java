/**
 * Created by zhuozengsi on 3/18/16.
 */
public class Solution {
    public int reverse(int x) {
        int rev_x = 0;
        StringBuffer buffer = new StringBuffer(String.valueOf(x));
        char c = buffer.charAt(0);

        if(c == '-'){
            buffer.deleteCharAt(0);
            buffer.reverse();
            rev_x = -1 * transformFromStr(buffer.toString());
        }else {
            buffer.reverse();
            rev_x = transformFromStr(buffer.toString());
        }
        return rev_x;
    }

    public int transformFromStr(String str){
        int maxInt = Integer.MAX_VALUE;
        int num = 0;
        int length = str.length();
        for(int i = 0; i < length; i ++){
            int numAtIndex = str.charAt(i) - '0';
            if(num <= maxInt/10){
                num = num * 10 + numAtIndex;
            }else
                return 0;
        }
        return num;
    }

}


