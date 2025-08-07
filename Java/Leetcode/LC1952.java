package Java.Leetcode;

public class LC1952 {
    public static boolean isThree(int n) { 
        int count = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                count++;
                
            }   
        }
        if(count == 3){
            return true;
        }

        return false;    
    }

    

    public static void main(String[] args) {
        int n = 9; // try changing this to test other values
        boolean result = isThree(n);
        System.out.println("Does " + n + " have exactly 3 divisors? " + result);
    }
    
}
