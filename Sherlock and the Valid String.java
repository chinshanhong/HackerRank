import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        int[] arr = new int[map.size()];
        int idx = 0;
        for(int occ : map.values()){
            arr[idx++] = occ;
        }
        
        Arrays.sort(arr);
        
        if(arr.length == 1){
            return "YES";
        }
        
        int first = arr[0];
        int secondFirst = arr[1];
        int last = arr[arr.length - 1];
        int secondLast = arr[arr.length - 2];
        
        if(first == last){
            return "YES";
        }
        if(first == 1 && secondFirst == last){
            return "YES";
        }
        if(first == secondLast && last == secondLast + 1){
            return "YES";
        }
        return "NO";
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
