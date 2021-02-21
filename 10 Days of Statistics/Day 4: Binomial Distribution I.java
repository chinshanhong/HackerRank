import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        double boyRatio = 1.09, girlRatio = 1.00, 
        p = boyRatio / (boyRatio + girlRatio), q = 1 - p, sum = 0;
        int n = 6, x = 3;
        
        while(x <= n){
            sum += (factorial(n) / (factorial(x) * factorial(n - x))) * Math.pow(p, x) * Math.pow(q, n - x);
            x++;
        }
        System.out.printf("%.3f", sum);
    }
    public static int factorial(int n){
        int result = 1;
        for(int i = n; i > 0; i--){
            result *= i;
        }
        return result;
    }
}
