class Solution {
    public int majorityElement(int[] nums) {
        int major = nums[0]; // Start with the first element as candidate
        int count = 1; // Initialize count to 1

        // Step 1: Find the candidate for majority element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                count++; // Increment count if the same element
            } else {
                count--; // Decrement count if a different element
            }

            if (count == 0) { 
                major = nums[i]; // Change the candidate
                count = 1; // Reset count to 1
            }
        }

        // Step 2: Return the candidate (assumed to be valid as per problem statement)
        return major;
    }
}