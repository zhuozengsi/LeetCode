/**
 * Created by zhuozengsi on 4/21/16.
 */
public class Main {
    public static void main(String[] args){
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        System.out.println(new Solution().coinChange(coins,amount));
    }
}
