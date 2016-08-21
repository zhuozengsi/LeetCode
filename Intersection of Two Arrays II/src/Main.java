import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Main {

    public static void main(String[] args){

        Solution solution = new Solution();
        int[] num1 = {1,2,3,2,2};
        int[] num2 = {2,2,2,2};
        int[] num = solution.intersect(num1, num2);
        System.out.println(Arrays.toString(num));

    }


}
