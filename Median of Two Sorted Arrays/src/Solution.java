import java.util.Arrays;

/**
 * Created by zhuozengsi on 3/9/16.
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int[] nums = new int[size1 + size2];
        for(int i = 0; i < size1 + size2; i++){
            if(i < size1){
                nums[i] = nums1[i];
            }else {
                nums[i] = nums2[i - size1];
            }
        }

        Arrays.sort(nums);
        

    }
}
