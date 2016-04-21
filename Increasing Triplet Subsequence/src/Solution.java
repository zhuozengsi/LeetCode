/**
 * Created by zhuozengsi on 4/19/16.
 */
public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] < min){
                min = nums[i];
            }else if(nums[i] > min){
                if(nums[i] > mid)
                    return true;
                mid = nums[i];
            }
        }

        return false;
    }
}
