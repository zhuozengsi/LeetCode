import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by zhuozengsi on 4/2/16.
 */
public class Main {

    public static void main(String[] args){
        final int[] arr = new int[]{1,2,3};
        System.out.println(Arrays.toString(arr));
        arr[1] = 4;
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum: " + sum(arr));

        TreeMap<Integer, Integer> map = new TreeMap<>();

    }

    private static int sum(final int[] arr){
        int sum = 0;
        int length = arr.length;
        for(int i = 0; i < length; i++){
            sum += arr[i];
        }

        arr[0] = 10;
        System.out.println(Arrays.toString(arr));

        return sum;
    }


}
