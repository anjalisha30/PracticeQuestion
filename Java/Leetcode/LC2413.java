package Java.Leetcode;

public class LC2413 {
    public static int smallestEvenMultiple(int n) {
        if(n%2==0){
             return n;
        }
        else{
            return n*2;
        }
        
    }
     public static void main(String[] args) {
        int n = 7; // you can change this to test other numbers
        int result = smallestEvenMultiple(n);
        System.out.println("Smallest even multiple of " + n + " is: " + result);
    }
}
