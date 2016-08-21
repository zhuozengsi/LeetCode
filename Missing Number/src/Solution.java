/**
 * Created by zhuozengsi on 8/21/16.
 */
public class Solution {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n+1)*n >> 1;
        int sumOfNum = 0;
        for(int i = 0; i < n; i ++){
            sumOfNum += nums[i];
        }
        return sum - sumOfNum;

    }

}
