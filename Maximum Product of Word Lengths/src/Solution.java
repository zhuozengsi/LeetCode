/**
 * Created by zhuozengsi on 4/22/16.
 */
public class Solution {

    public int maxProduct(String[] words) {
        int length = words.length;
        if(words == null || length == 0) return 0;
        int max = 0;
        int[] signatures = new int[length];
        for(int i = 0; i < length; i ++){
            signatures[i] = createSignature(words[i]);
        }

        for(int i = 0; i < length -1; i ++){
            for(int j = i + 1; j < length; j ++){
                if((signatures[i] & signatures[j]) == 0){
                    int product = words[i].length() * words[j].length();
                    max = max > product ? max : product;
                }
            }
        }

        return max;
    }


    private int createSignature(String str){
        if(str == null || str.length() == 0) return 0;
        int signature = 0;
        for(int i = 0; i < str.length(); i ++){
            int name = 1 << (str.charAt(i) - 'a');
            if((signature & name) == 0){
                signature += name;
            }
        }
        return signature;
    }

}
