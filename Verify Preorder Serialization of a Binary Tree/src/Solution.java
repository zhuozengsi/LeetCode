import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by zhuozengsi on 4/19/16.
 */
public class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        System.out.println(Arrays.toString(nodes));
        Stack<String> stack = new Stack<>();
        int length = nodes.length;
        try {
            for (int i = 0; i < length; i++) {

                if (nodes[i].equals("#")) {
                    while (!stack.isEmpty() && stack.peek().equals("#")) {
                        stack.pop();
                        stack.pop();

                    }
                    if(stack.isEmpty() && i == length - 1)
                        return true;
                    stack.push("#");

                } else {
                    stack.push(nodes[i]);
                }
            }
        }catch (EmptyStackException e){
            //System.out.println("异常!");
            return false;
        }

        return stack.isEmpty();
    }
}
