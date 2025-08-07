package Java.Leetcode;
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(hours[i] >= target){
            count++;
            }
        }
        return count;
    }
}

public class LC2798 {
    public static void main(String[] args) {
        // Sample input
        int[] hours = {5, 8, 6, 10, 2};
        int target = 6;

        // Create an object of Solution class
        Solution sol = new Solution();

        // Call the method and store result
        int result = sol.numberOfEmployeesWhoMetTarget(hours, target);

        // Print the result
        System.out.println("Number of employees who met the target: " + result);
    }
}