/**
 * Created by zhuozengsi on 8/20/16.
 */
public class Solution {

    public int[] singleNumber(int[] nums) {

        int[] result = new int[2];
        int flag = 1;
        int add = 0;

        for(int i = 0; i < nums.length; i ++){
            add ^= nums[i];
        }


        while ( (add&flag) == 0){
            flag = flag << 1;
        }

        for(int i = 0; i < nums.length; i ++){

            if((nums[i]&flag) != 0)
                result[0] ^= nums[i];
            else
                result[1] ^= nums[i];

        }

        return result;
    }



}
