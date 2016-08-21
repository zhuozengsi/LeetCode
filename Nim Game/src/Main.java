/**
 * Created by zhuozengsi on 8/18/16.
 */
public class Main {

    public static void main(String[] args){

        System.out.println(canWinNim(2));

    }

    public static boolean canWinNim(int n) {
       // return n%4 != 0;
        return (n & 1)!=0 || (n & 2) != 0;
    }

}
