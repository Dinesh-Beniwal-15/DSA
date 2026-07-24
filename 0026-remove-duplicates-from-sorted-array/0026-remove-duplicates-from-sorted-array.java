class Solution {
    public int removeDuplicates(int[] nums) {
        // Edge case
        if (nums.length == 0) return 0;

        int i = 0; // pointer for unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // move to next position
                nums[i] = nums[j]; // place unique element
            }
        }

        return i + 1; // total unique elements
    }
}











