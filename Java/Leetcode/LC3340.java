package Java.Leetcode;

public class LC3340 {
     public static boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        
        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';  // ✅ correct conversion
            
            if(i % 2 == 0){
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }
        return evenSum == oddSum;
    }

     public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "24123";

        System.out.println(num1 + " → " + isBalanced(num1)); // false
        System.out.println(num2 + " → " + isBalanced(num2)); // true
    }
    
}
