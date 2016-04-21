import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhuozengsi on 4/20/16.
 */
public class Solution {

    private Map<Integer,Integer> maxs = new HashMap<>();

    public int integerBreak(int n) {
        if(n <= 3)
            return n - 1;
        if(maxs.containsKey(n))
            return maxs.get(n);

        int num1 = n >> 1;
        int num2 = n - num1;
        int max = Integer.MIN_VALUE;
        int max1 = max + 1;
        while(num1 >= 2 && max1 >= max ){
            max1 = Math.max(integerBreak(num1), num1) * Math.max(integerBreak(num2), num2);
            if(max1 >= max){
                max = max1;
                num1 --;
                num2 ++;
            }
        }

        maxs.put(n, max);
        return max;

    }
}
