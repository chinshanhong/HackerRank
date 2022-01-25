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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] roadNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int roadNodes = Integer.parseInt(roadNodesEdges[0]);
        int roadEdges = Integer.parseInt(roadNodesEdges[1]);

        List<Integer> roadFrom = new ArrayList<>();
        List<Integer> roadTo = new ArrayList<>();
        List<Integer> roadWeight = new ArrayList<>();

        IntStream.range(0, roadEdges).forEach(i -> {
            try {
                String[] roadFromToWeight = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                roadFrom.add(Integer.parseInt(roadFromToWeight[0]));
                roadTo.add(Integer.parseInt(roadFromToWeight[1]));
                roadWeight.add(Integer.parseInt(roadFromToWeight[2]));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        int[][] dist =  new int[roadNodes][roadNodes];
        final int MAX = 351;
        
        for(int i = 0; i < dist.length; i++){
            for(int j = 0; j < dist.length; j++){
                if(i == j){
                    continue;
                }
                dist[i][j] = MAX;
            }
        }
        
        for(int i = 0; i < roadFrom.size(); i++){
            dist[roadFrom.get(i) - 1][roadTo.get(i) - 1] = roadWeight.get(i);
        }
        
        for(int k = 0; k < roadNodes; k++){
            for(int i = 0; i < roadNodes; i++){
                for(int j = 0; j < roadNodes; j++){
                    if(dist[i][j] > dist[i][k] + dist[k][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int x = Integer.parseInt(firstMultipleInput[0]);

                int y = Integer.parseInt(firstMultipleInput[1]);
                
                if(x == y){
                    System.out.println(0);
                }

                else if(dist[x - 1][y - 1] >= MAX){
                    System.out.println(-1);
                }
                else{
                    System.out.println(dist[x - 1][y - 1]);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
