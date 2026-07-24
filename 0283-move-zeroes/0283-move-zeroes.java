class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int insertpos=0;

        if(n!=1){
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    nums[insertpos]=nums[i];
                    insertpos++;
                
                }
            }

            while (insertpos < nums.length) {
                nums[insertpos] = 0;
                insertpos++;
            }
        }
        
        
        
        
    }
}