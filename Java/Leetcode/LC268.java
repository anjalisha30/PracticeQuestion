package Java.Leetcode;

 public class LC268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;

        for (int i = 0; i <= n; i++) {
            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int missing = missingNumber(nums); // call static method directly
        System.out.println("Missing number: " + missing); // Output: 2
    }
}
 
    

