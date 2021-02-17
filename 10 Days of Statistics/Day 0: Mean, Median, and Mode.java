import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int[] data = new int[N];
        int sum = 0, frequentcy = 0, mode;
        double mean, median;

        for(int i = 0; i < N; i++){
            data[i] = scan.nextInt();
        }
        //Sort the data array
        Arrays.sort(data);
        
        //find the mean
        //sums up the data values for the calculation of mean
        for(int i = 0; i < N; i++){
            sum += data[i];
        }
        mean = (double)sum / N;
        System.out.printf("%.1f", mean);
        
        //Find the median
        if(data.length % 2 == 1){
            median = data[N/2];
            System.out.printf("\n%.1f", median);
        }
               else{
            median = ((double)data[N/2] + data[N/2-1])/2;
            System.out.printf("\n%.1f", median);
        }
        
        //Find the mode
        ArrayList<Integer> uniqueData = new ArrayList<Integer>();
        ArrayList<Integer> frequentcyList = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            if(!uniqueData.contains(data[i])){
                uniqueData.add(data[i]);
            }
        }
        for(int i = 0; i < uniqueData.size(); i++){
            for(int j = 0; j < N; j++){
                if(uniqueData.get(i) == data[j]){
                    frequentcy++;
                }
            }
            frequentcyList.add(frequentcy);
            frequentcy = 0;
        }
        mode = uniqueData.get(frequentcyList.indexOf(Collections.max(frequentcyList)));
        System.out.println();
        System.out.println(mode);
    }
}
