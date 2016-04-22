/**
 * Created by zhuozengsi on 4/21/16.
 */
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        int n = 16;
        int n1 = n;
        n1 |= n1 >> 1;
        n1 |= n1 >> 2;
        n1 |= n1 >> 4;
        n1 |= n1 >> 8;
        n1 |= n1 >> 16;
        n1 = n1 - (n1>>1);
        if(n1 != n) System.out.println("非");
        else {
            String num = "01010101010101010101010101010101";
            int m = Integer.parseInt(num, 2);
            System.out.println((m & n) == n);
        }

    }
}
