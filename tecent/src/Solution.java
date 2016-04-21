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


class Node{
    int data;
    Node next;
}

public class Solution{
    public static void main(String[] args){

        int[] arr = new int[]{3,1,5,4,6,6,2,3,5,9};

    }

    public  int[] fineMMin(int arr[], int M){

        int[] result = new int[M];
        int length = arr.length;
        for (int i = 0; i < M; i ++){
            result[i] = arr[i];
        }


        for(int j = M; j < length; j++){
            int[] max = findMax(result);
            if(max[0] > arr[j]){
                result[max[1]] = arr[j];
            }
        }

        return result;

    }

    private int[] findMax(int arr[]){
        int[] max = new int[]{arr[0],0};
        for (int i = 1; i < arr.length; i ++){
            if (max[0] < arr[i]) {
                max[0] = arr[i];
                max[1] = i;
            }
        }
        return max;
    }

}