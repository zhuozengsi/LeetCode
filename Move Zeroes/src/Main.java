import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/18/16.
 */
public class Main {

    public static void main(String[] args){

        Solution solution = new Solution();

        int[] nums = {1, 3, 4, 0, 2, 0,8, 0,10,0,0};
        solution.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}
