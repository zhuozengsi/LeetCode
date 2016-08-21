/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {
    public String convertToTitle(int n) {

        if(n == 0) return null;
        StringBuilder builder = new StringBuilder();
        while (n != 0){

            char c = (char)((n-1)%26+'A');
            builder.append(c);
            n = n /27;
        }

        return builder.reverse().toString();

    }
}
