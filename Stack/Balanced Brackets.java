public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        char[] brackets = s.toCharArray();
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < brackets.length; i++){
            if((int)brackets[i] == 40 || (int)brackets[i] == 123 || (int)brackets[i] == 91){
                stack.push((int)brackets[i]);
            }
            else if((int)brackets[i] == 125){
                if(stack.isEmpty() || stack.peek() != 123){
                    return "NO";
                }
                else{
                    stack.pop();
                }
            }

            else if((int)brackets[i] == 41){
                if(stack.isEmpty() || stack.peek() != 40){
                    return "NO";
                }
                else{
                    stack.pop();
                }
            }

            else if((int)brackets[i] == 93){
                if(stack.isEmpty() || stack.peek() != 91){
                    return "NO";
                }
                stack.pop();
            }
        
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return "YES";
    }
