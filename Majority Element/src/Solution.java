/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {
    public int majorityElement(int[] nums) {

        int result = nums[0];
        int time = 1;

        for(int i = 1; i < nums.length; i ++){

            if(time == 0){

                result = nums[i];
                time = 1;
            }else if(result == nums[i])
                time ++;
            else
                time --;
        }

        return result;

    }
}