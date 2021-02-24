class Result {

    /*
     * Complete the 'gamingArray' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String gamingArray(List<Integer> arr) {
        int Score = 0, max = 0;
        for(int i = 0; i < arr.size(); i++){
            if(max < arr.get(i)){
                max = arr.get(i);
                Score++;
            }
        }
        if(Score % 2 == 0) return ("ANDY");
        else return ("BOB");
    }
}
