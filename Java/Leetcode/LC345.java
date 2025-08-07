package Java.Leetcode;

public class LC345{

public static String reverseVowels(String s) {
         char[] chars = s.toCharArray(); // convert string into char array 
         int l = 0;
         int r = chars.length-1;

         while(l<r){
             if ("AEIOUaeiou".indexOf(chars[l]) == -1) {
                l++;
            } else if ("AEIOUaeiou".indexOf(chars[r]) == -1) {
                r--;
            } else {
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
           
                      r--;
         }

     }  

         return new String(chars);
  }

  
    public static void main(String[] args) {
        String input = "Leetcode";
        String output = reverseVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Vowels Reversed: " + output);
    }

} 
