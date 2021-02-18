import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Read the inputs
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] X = new int[n];
        for(int i = 0; i < n; i++){
            X[i] = scan.nextInt();
        }
        
        //Sort the data and declare the variables for lower quartile, median and upper quartile
        Arrays.sort(X);
        int Q1, Q2, Q3;
        //Declare the arrays for the calculation of lower and upper quartile
        int[] lowerHalf, upperHalf;
        
        //Find the median and get the values for lowerHalf and upperHalf arrays
        if(X.length % 2 == 1){
            Q2 = X[X.length/2];
            lowerHalf = Arrays.copyOfRange(X, 0, X.length / 2);
            upperHalf = Arrays.copyOfRange(X, X.length / 2 + 1, X.length);
        }
        else{
            Q2 = (X[X.length / 2] + X[X.length / 2 - 1]) / 2;
            lowerHalf = Arrays.copyOfRange(X, 0, X.length / 2);
            upperHalf = Arrays.copyOfRange(X, X.length / 2, X.length);
        }
        
        Q1 = getLowerQuartile(lowerHalf);
        Q3 = getUpperQuartile(upperHalf);
        
        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);
    }
    
    //Method for the calculation of upper quartile
    public static int getUpperQuartile(int[] upperHalf){
        if(upperHalf.length % 2 == 0)
            return (upperHalf[upperHalf.length / 2] + upperHalf[upperHalf.length / 2- 1]) / 2;
        else return upperHalf[upperHalf.length / 2];
    }
    
    //Method for the calculation of lower quartile
    public static int getLowerQuartile(int[] lowerHalf){
        if(lowerHalf.length % 2 == 0)
            return (lowerHalf[lowerHalf.length / 2] + lowerHalf[lowerHalf.length / 2- 1]) / 2;
        else return lowerHalf[lowerHalf.length / 2];
    }
}
