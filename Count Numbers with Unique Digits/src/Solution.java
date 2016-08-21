import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/21/16.
 */
public class Solution {

    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0) return 1;


        if(n <= 10) {
            int[] result = new int[n +1];
            result[0] = 1;
            int count = 1;
            for (int i = 1; i <= n; i++) {
                if(count == 1) count *= 9;
                else {
                    count *= (10-i+1);
                }

                result[i] = result[i-1] + count;

            }
            System.out.println(Arrays.toString(result));
            return result[result.length-1];
        }else {

            int[] result= new int[11];
            result[0] = 1;
            int count = 1;
            for(int i = 1; i < 11; i ++){
                if(count == 1) count *= 9;
                else {
                    count *= (10-i+1);
                }

                result[i] = result[i-1] + count;
            }
            System.out.println(Arrays.toString(result));
            return result[10];

        }
    }


}
