/**
 * Created by zhuozengsi on 3/17/16.
 */
public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        String s = "PAYPALISHIRING";
        String str = solution.convert(s,2);
        System.out.println(str);

        StringBuffer buffer = new StringBuffer("-1234567");
        Integer i = Integer.valueOf(2111111144 * 3);
        buffer.reverse();
        System.out.println(i);

    }
}
