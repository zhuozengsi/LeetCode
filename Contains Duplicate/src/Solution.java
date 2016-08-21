import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Solution {

    public boolean containsDuplicate(int[] nums) {

        if(nums == null) return false;

//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//
//            Integer integer = map.get(Integer.valueOf(nums[i]));
//
//            if(integer == null){
//                map.put(Integer.valueOf(nums[i]), 1);
//            }else
//                map.put(Integer.valueOf(nums[i]), integer + 1);
//
//
//        }
//
//        for(Map.Entry entry : map.entrySet()){
//            if((Integer)entry.getValue() > 1)
//                return true;
//        }
//
//        return false;

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i ++){
            if(nums[i] == nums[i+1])
                return true;
        }

        return false;

    }
}