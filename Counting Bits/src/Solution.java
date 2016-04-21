/**
 * Created by zhuozengsi on 3/18/16.
 */
public class Solution {
    public int[] countBits(int num) {
        int[] counts = new int[num + 1];
        for(int i = 0; i <= num; i ++){
            counts[i] = countBit(i);
        }
        return counts;
    }

    public int countBit(int num){
        int count = 0;
        for (; num != 0; count++){
            num = num & (num -1);
        }
        return count;
    }
}
