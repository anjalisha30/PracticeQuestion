package Java.GFG;

import java.util.Arrays; 

class RotateArray {
    public void rotate(int[] arr) { // 
        int n = arr.length;
        int last = arr[n - 1];

        int l = n - 1;
        while (l > 0) {
            arr[l] = arr[l - 1];
            l--;
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        RotateArray sol = new RotateArray();

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Before rotation: " + Arrays.toString(arr));

        sol.rotate(arr);

        System.out.println("After rotation: " + Arrays.toString(arr));
    }
}
