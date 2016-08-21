/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0 ) return false;

        if (k == 0) return true;

        for(int i = 0; i < nums.length - k + 1; i ++ ){

            int num = nums[i];

            for(int j = i + 1; j <= i + k -1; j++ ){
                if(num == nums[j]) return true;
            }

        }

        return false;
    }
}