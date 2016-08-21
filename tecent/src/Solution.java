import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//public class Solution {
//
//    public static void main(String[] args){
//
//       Scanner scanner = new Scanner(System.in);
////        String string = scanner.nextLine();
////        System.out.println(reverse(string));
//
//        int rows = scanner.nextInt();
//        int columns = scanner.nextInt();
//        System.out.println("r: " + rows+", col: " + columns);
//        int[][] forturn = new int[rows][columns];
//        for(int i = 0; i < rows; i ++){
//            for(int j = 0; j < columns; j ++){
//                forturn[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println(Arrays.toString(forturn));
//
//    }
//
//    public static String reverse(String str){
//        StringBuffer buffer = new StringBuffer();
//        if(str == null || str.equals("")){
//            return "";
//        }
//
//        String[] strs = str.split(" ");
//        for(int i = strs.length-1; i > 0; i--){
//            buffer.append(strs[i]);
//            buffer.append(" ");
//        }
//
//        buffer.append(strs[0]);
//        return buffer.toString();
//
//    }
//
//    public static int maxFortune(int[][] fortune, int rows, int culomn){
//        int sum = 0;
//        int i = 0;
//        int j = 0;
//        while(i<rows && j < culomn){
//            if((i + 1)<rows-1 && (j + 1) < culomn-1){
//                if(fortune[i+1][j] > fortune[i][j+1]){
//                    sum += fortune[++i][j];
//                }else {
//                    sum += fortune[i][++j];
//                }
//            }
//            if(i == rows -1){
//                sum+= fortune[i][++j];
//            }
//
//            if(j == culomn -1){
//                sum+= fortune[++i][j];
//            }
//
//
//        }
//        return sum;
//    }
//
//}


public class Solution{

    public static void main(String[] args){
        int n = 24;
        System.out.println(changeToOne(n));

    }

    private static int changeToOne(int n){

        int count = 0;
        while (n != 1){

            if((n & 0b111) == 0b111){
                //n 的二进制表示末端最少有3个1
                n = n + 1;
            }else if ((n & 0b1) == 0b1) {
                // n 的二进制表示末位是1
                n = n -1;
            }else
                // n 的二进制表示末位是0
                n = n >> 1;
            count ++;

        }

        return count;
    }
}