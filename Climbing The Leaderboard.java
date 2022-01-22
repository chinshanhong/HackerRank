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
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int rank = 1;
        for(int i = 0; i < ranked.size(); i++){
            if(!map.containsKey(ranked.get(i))){
                map.put(ranked.get(i), rank++);
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i < player.size(); i++){
            if(player.get(i) > ranked.get(0)){
                result.add(1);
            }
            else if(player.get(i) < ranked.get(ranked.size() - 1)){
                result.add(map.get(ranked.get(ranked.size() - 1)) + 1);
            }
            else{
                int currPlayerScore = player.get(i);
                int high = ranked.size() - 1;
                int low = 0;
                
                while(low <= high){
                    int mid = (high + low) / 2;
                    
                    if(ranked.get(mid) > currPlayerScore && currPlayerScore >= ranked.get(mid + 1)){
                        result.add(map.get(ranked.get(mid)) + 1);
                        break;   
                    }
                    else if(ranked.get(mid) < currPlayerScore && currPlayerScore < ranked.get(mid - 1)){
                        result.add(map.get(ranked.get(mid)));
                        break;
                    }
                    
                    else if(ranked.get(mid) == currPlayerScore){
                        result.add(map.get(ranked.get(mid)));
                        break;
                    }
                    else if(ranked.get(mid) > currPlayerScore){
                        low = mid + 1;
                    }
                    else if(ranked.get(mid) < currPlayerScore){
                        high = mid - 1;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
