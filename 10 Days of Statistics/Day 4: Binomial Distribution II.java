import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n = 10, x = 2;
        double result1 = 0, result2 = 0, p = 0.12
        , q = 1 - p, sum1 = 0, sum2 = 0;
        for(int i = 0; i <= x; i++){
            sum1 += (factorial(n) / (factorial(i) * factorial(n - i))) * Math.pow(p, i) * Math.pow(q, n - i);
        }
        for(int i = x; i <= n; i++){
            sum2 += (factorial(n) / (factorial(i) * factorial(n - i))) * Math.pow(p, i) * Math.pow(q, n - i);
        }
        System.out.printf("%.3f", sum1);
        System.out.printf("\n%.3f", sum2);
    }
    public static int factorial(int n){
        int result = 1;
        for(int i = n; i > 0; i--){
            result *= i;
        }
        return result;
    }
}
