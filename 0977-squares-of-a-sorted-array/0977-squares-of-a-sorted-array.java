class Solution {
    public int[] sortedSquares(int[] nums) {
        // int n=nums.length;

        // for(int i=0;i<n;i++){
        //     nums[i]=(int)Math.pow(nums[i],2);
        // }
        // Arrays.sort(nums);
        // return nums;

        int n=nums.length;
        int[] result=new int[n];

        int low=0;
        int high=n-1;

        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[low])>Math.abs(nums[high])){
                result[i]=nums[low]*nums[low];
                low++;
            }
            else{
                result[i]=nums[high]*nums[high];
                high--;
            }
        }
        return result;
    }
}