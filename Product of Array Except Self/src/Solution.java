import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/20/16.
 */
public class Solution {

    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < result.length; i ++){
            product *= nums[i-1];
            result[i] = product;
        }
        product = 1;
        for(int i = result.length -2 ; i >= 0; i --){
            product *= nums[i+1];
            result[i] *= product;

        }
        return result;
    }


}
