import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        double p = (double)1 / 3, q = 1 - p;
        int n = 5;
        double result = Math.pow(q, n - 1) * p;
        System.out.printf("%.3f", result);
    }
}
