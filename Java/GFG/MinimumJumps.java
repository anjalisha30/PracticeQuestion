package Java.GFG;

public class MinimumJumps {
    static int minJumps(int[] arr) {
        int totalJumps = 0;
        int dest = arr.length - 1;
        int coverage = 0;
        int lastIndex = 0;

        if (arr.length == 1) return 0;   
        if (arr[0] == 0) return -1;     

        for (int i = 0; i < arr.length - 1; i++) { 
            coverage = Math.max(coverage, i + arr[i]);

            if (i == lastIndex) {
                if (coverage == lastIndex) return -1; 
                totalJumps++;
                lastIndex = coverage;

                if (coverage >= dest) return totalJumps; 
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};   // sample input
        int result = minJumps(arr);    // call function
        System.out.println("Minimum jumps = " + result);
    }
}

    

