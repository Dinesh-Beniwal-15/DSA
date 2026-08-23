class Solution {
    public int singleNumber(int[] nums) {
        // int num;
        // boolean unique;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]!=nums[j]){
        //             unique=true;
        //         }
        //         else{
        //             unique=false;
        //         }
        //     }
        //     if(unique=true){
        //         return nums[i];
        //     }
        // }
        // return 0;

        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        
        return index;
    }
}