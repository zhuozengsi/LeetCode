import java.util.Arrays;
import java.util.Random;

/**
 * Created by zhuozengsi on 8/20/16.
 */
public class Solution {

    private int[] numbers;

    public Solution(int[] nums) {
        this.numbers = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {

        return numbers;

    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] nums = new int[numbers.length];
        System.arraycopy(this.numbers, 0, nums, 0, nums.length);
        int factorial = 1;
        for(int i = 1; i <= numbers.length; i ++){
            factorial *= i;
        }
        int target = new Random().nextInt(factorial);
        permation(nums, 0, target+1);
        System.out.println(count + ": " + Arrays.toString(nums));
        return null;
    }

    private int count = 0;

    private void permation(int[] nums, int i, int target){

        if(i == nums.length) {
            count ++;
            if(count == target) {
                System.out.println(count + ": " + Arrays.toString(nums));
                return;
            }
            return;
        }

        for(int j = i; j < nums.length; j ++){
            if(count == target)
                break;
            swap(nums, i, j);
            permation(nums, i+1, target);
            swap(nums,j,i);
            System.out.println(count + ": " + Arrays.toString(nums));
        }

    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */