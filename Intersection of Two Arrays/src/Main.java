import java.util.Arrays;

/**
 * Created by zhuozengsi on 8/19/16.
 */
public class Main {

    public static void main(String[] args){

        Solution solution = new Solution();
        int[] num1 = {1};
        int[] num2 = {1};
        int[] num = solution.intersection(num1, num2);
        System.out.println(Arrays.toString(num));

    }


}
