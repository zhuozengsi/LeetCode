/**
 * Created by zhuozengsi on 3/17/16.
 */
public class Solution {

    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        int length = s.length();
        int numCells = length/(numRows + numRows -2);
        if(numCells * (2*numRows-2) < length)
            numCells ++;
        int numColumns = (numRows -1)*numCells;
        char[][] str = new char[numRows][numColumns];
        int charIndex = 0;
        for(int column = 0; column < numColumns && charIndex < length; column+=(numRows -1)){

            for(int row = 0; charIndex < length && row < numRows; row ++){
                str[row][column] = s.charAt(charIndex ++);
            }
            for (int row = numRows -2,j = 1;charIndex < length && row > 0 &&j < numRows -1; row --, j++){

                str[row][column + j] = s.charAt(charIndex++);

            }

        }

        StringBuffer buffer = new StringBuffer();

        for(int row = 0; row < numRows; row++){
            for(int column = 0; column < numColumns; column ++){
                if(str[row][column] != '\0'){
                    buffer.append(str[row][column]);
                }
            }
        }


        return buffer.toString();
    }
}