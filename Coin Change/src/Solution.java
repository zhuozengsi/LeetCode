import java.util.Arrays;

/**
 * Created by zhuozengsi on 4/21/16.
 * We solve the question by dynamic programming Bottom to Up.
 * We create an array to store the minimum number of coins whose sum is the index of the array,
 * so the last one is the answer.
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
     int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, -1);
        minCoins[0] = 0;
        for(int i = 1; i <= amount; i ++){
            //for every index we should calculate the min number of coins whose total amount money is index.
            for(int j = 0; j < coins.length; j ++){
                if(i == coins[j])
                    minCoins[i] = 1;
                else if (i > coins[j] && minCoins[i-coins[j]] != -1){
                    //If we have never got the result of i, minCoins[i] == -1.
                    minCoins[i] = minCoins[i] == -1 ? minCoins[i-coins[j]] + 1 : Math.min(minCoins[i], minCoins[i-coins[j]] + 1);
                }
            }
        }
        System.out.println(Arrays.toString(minCoins));
        return minCoins[amount];
    }
}
