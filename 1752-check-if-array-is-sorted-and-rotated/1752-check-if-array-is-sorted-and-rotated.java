class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;

        int b=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                b++;
            }
        }
        if(b==1 || b==0){
            return true;
        }
        else return false;
    }
}