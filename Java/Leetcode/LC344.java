package Java.Leetcode;

public class LC344 {
    public static void reverseString(char[] s) {
      int l = 0;
      int r = s.length - 1;
       while(l<r){
      char temp = s[l];
      s[l] = s[r];
      s[r] = temp;

      l++;
      r--;
     }
     
    }
      public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'}; // You can try with other words too

        System.out.print("Original: ");
        for (char c : s) {
            System.out.print(c + " ");
        }

        reverseString(s);

        System.out.print("\nReversed: ");
        for (char c : s) {
            System.out.print(c + " ");
        }
    }
    
}
