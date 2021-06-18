class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) >= arr.get(n - 1)){
                int lastElement = arr.get(n - 1);
                while((n - 1) > i){
                    arr.set(n - 1, arr.get(n - 2));
                    n--;
                    printElements(arr);
                    System.out.println();
                }
                arr.set(n - 1, lastElement);
                printElements(arr);
                break;
            }
        }
    }
    
    public static void printElements(List<Integer> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }

}
