import java.util.Arrays;

/**
 * Created by zhuozengsi on 7/17/16.
 */
public class Solution {

    private int min(int a, int b, int c){

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }


    public int nthUglyNumber(int n) {

        if(n <= 0) return 0;

        int[] uglyArray = new int[n];
        int twoIndex = 0;
        int threeIndex = 0;
        int fiveIndex = 0;
        uglyArray[0] = 1;

        for(int i = 1; i < n; i ++){
            int ugly = min(uglyArray[twoIndex]*2, uglyArray[threeIndex]*3, uglyArray[fiveIndex]*5);

            if (ugly == uglyArray[twoIndex]*2){
                twoIndex ++;
            }

            if (ugly == uglyArray[threeIndex]*3){
                threeIndex ++;
            }

            if (ugly == uglyArray[fiveIndex]*5){
                fiveIndex ++;
            }

            uglyArray[i] = ugly;

        }

        //System.out.println(Arrays.toString(uglyArray));

        return uglyArray[n-1];


    }


}
