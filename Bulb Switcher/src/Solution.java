import java.util.Arrays;

/**
 * Created by zhuozengsi on 4/21/16.
 */
public class Solution {

    public int bulbSwitch(int n) {
        if(n==0) return 0;
        boolean[] bulbs = new boolean[n];
        Arrays.fill(bulbs,true);
        int sum = 0;

        for(int i = 2; i <= n; i ++){
            for(int j = 1; j*i <= n; j ++){
                bulbs[i*j-1] = !bulbs[i*j-1];
            }
        }

        for(int i = 0; i < n; i ++){
            if(bulbs[i])
                sum ++;
        }

        return sum;
    }

    public int bulbSwitch1(int m) {
        if(m == 0) return 0;
        int n = 1;
        while (true){
            if((n-1)*(n-1)+2*(n-1) < m && n*n + 2 * n >= m){
                break;
            }else n++;
        }
        return n;
    }

    //sum = n*n + 2*n;

    public int bulbSwitch2(int m) {
        if(m == 0) return 0;
        int n = (int)Math.ceil(Math.sqrt(m+1)) - 1;
        return n;
    }


}
