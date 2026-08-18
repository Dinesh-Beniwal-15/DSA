class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);
        
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                return i;
                
            }
        }
        return n;

       
        // int n = nums.length;
        // int Tsum = (n * (n + 1)) / 2;
        // int actualSum = Arrays.stream(nums).sum();
        // return Tsum - actualSum;
       

        
    }
}