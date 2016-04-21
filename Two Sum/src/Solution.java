import java.util.Arrays;

/**
 * Created by zhuozengsi on 3/9/16.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] indexes = new int[2];
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if (nums[i] + nums[j] == target){
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;

    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] indexes = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(indexes));
    }

}
