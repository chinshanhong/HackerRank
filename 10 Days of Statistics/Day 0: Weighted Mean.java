import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] X = new int[N];
        int[] W = new int[N];
        int sum = 0, weightSum = 0;
        double weightedMean;
        
        for(int i = 0; i < N; i++){
            X[i] = scan.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            W[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            sum += X[i] * W[i];
            weightSum += W[i];
        }
        weightedMean = (double)sum / weightSum;
        System.out.printf("%.1f", weightedMean);
    }
}
