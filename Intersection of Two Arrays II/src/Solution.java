import java.util.*;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1 == null || nums2 == null) return null;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if(nums1.length < nums2.length){
            return interSectionWithSorted(nums1, nums2);
        }else
            return interSectionWithSorted(nums2, nums1);


    }

    private int[] interSectionWithSorted(int[] shorter, int[] longer){

        List<Integer> result = new ArrayList<>();
        int left = -1;

        for(int i = 0; i < shorter.length; i ++){

            int index = find(shorter[i], longer, left+1);
            if(index != -1){
                //find the element
                left = index;
                result.add(shorter[i]);
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


    private int find(int target, int[] num, int from){

        if(from < num.length){

            for(int i = from; i < num.length; i ++){

                if( target == num[i])
                    return i;

            }

        }

        return -1;

    }

}
