package Java.Leetcode;

public class LC66 {
    public static int[] plusOne(int[] digits) {
    for(int i = digits.length-1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits; 
            }
            else{
                digits[i] = 0;
            }
        }
        int[] newDigit  = new int[digits.length+1];
        newDigit[0] = 1;
        return newDigit;
        
    }
    public static void main(String[] args) {
        int[] digits = {9, 9, 9}; // try with {1,2,3} or {4,3,2,1}
        int[] result = plusOne(digits);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    
}
