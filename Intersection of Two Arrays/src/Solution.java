import java.util.*;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null) return null;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if(nums1.length < nums2.length){
            return interSectionWithSorted(nums1, nums2);
        }else
            return interSectionWithSorted(nums2, nums1);


    }

    private int[] interSectionWithSorted(int[] shorter, int[] longer){

        Set<Integer> result = new HashSet<>();

        for(int i = 0; i < shorter.length; i ++){

            int left = 0;
            int right = longer.length-1;

            while (left <= right){

                int mid = (left+right) >> 1;
                if(longer[mid] == shorter[i]){
                    result.add(shorter[i]);
                    break;
                }else if( longer[mid] < shorter[i]){
                    left = mid + 1;
                }else {
                    right = mid -1;
                }


            }


        }

        int[] num = new int[result.size()];
        int i = 0;
        for(Integer integer : result){

            num[i] = integer;
            i ++ ;


        }
        return num;
    }



}
