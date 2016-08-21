import java.util.HashMap;
import java.util.List;

/**
 * Created by zhuozengsi on 8/18/16.
 */
public class Solution {

    public void moveZeroes(int[] nums) {

        if (nums == null) return;
        int zoreIndex = 0;
        int nonZeroIndex = 0;
        int length = nums.length;

        while (zoreIndex < length && nonZeroIndex < length){

            while (zoreIndex < length && nums[zoreIndex] != 0){
                zoreIndex ++ ;
            }
            nonZeroIndex = zoreIndex + 1;

            while (nonZeroIndex < length && nums[nonZeroIndex] == 0){
                nonZeroIndex ++;
            }

            if(zoreIndex < length && nonZeroIndex < length){
                int temp = nums[zoreIndex];
                nums[zoreIndex] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;
            }

        }

    }

}
