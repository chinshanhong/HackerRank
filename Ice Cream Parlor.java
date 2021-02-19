// Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        findSuitableFlavors(m, arr, result, 0);
        Arrays.sort(result);
        return result;
    }
    static void findSuitableFlavors(int m, int[] arr, int[]result, int pointer){
        if(pointer >= arr.length) return;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == pointer) continue;
            sum = arr[pointer] + arr[i];
            if(sum == m){
                result[0] = pointer + 1;
                result[1] = i + 1;
                break;
            }
            sum = 0;
        }
        pointer++;
        findSuitableFlavors(m, arr, result, pointer);
    }
