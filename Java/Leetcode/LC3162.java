package Java.Leetcode;

class LC3162{
    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int count = 0;
        for(int i = 0; i<n1; i++){
            for(int j = 0; j<n2; j++){
                if(nums1[i] % (nums2[j] *k) == 0){
                    count++;
                }
            }
        }
        return count;
    }
    
     public static void main(String[] args) {

        int[] nums1 = {1, 3, 4}; // example nums1
        int[] nums2 = {1, 3, 4};           // example nums2
        int k = 1;

        int result = numberOfPairs(nums1, nums2, k);

        System.out.println("Number of valid pairs: " + result);
    }
}
