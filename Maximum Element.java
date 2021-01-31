import java.io.*;
import java.util.*;

public class Solution {
    private Stack<Integer> mainStack;
    private Stack<Integer> trackStack;
    public Solution(){
        mainStack = new Stack<Integer>();
        trackStack = new Stack<Integer>();
    }
    public void push(int x){
            mainStack.push(x);
            if(mainStack.size() == 1){
                trackStack.push(x);
                return;
            }
            if(x > trackStack.peek()){
                trackStack.push(x);
            }
            else{
                trackStack.push(trackStack.peek());
            }
    }
     public void pop(){
            mainStack.pop();
            trackStack.pop();
    }
    public void getMax(){
        System.out.println(trackStack.peek());
    }
    public static void main(String[] args) {
        Solution stack = new Solution();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i < N; i++){
            int value = scan.nextInt();
            if(value == 1){
                stack.push(scan.nextInt());
            }
            else if(value == 2){
                stack.pop();
            }
            else{
                stack.getMax();
            }
        }
    }
}
