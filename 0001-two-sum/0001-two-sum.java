class Solution {
    public int[] twoSum(int[] nums, int target) {
        // method 1---
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] { i, j };
        //         }
        //     }
        // }

        // method 2---------------------------------
        int n=nums.length;

        Map<Integer,Integer> numMap=new HashMap<>();

        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(numMap.containsKey(complement)){
                return new int[] {numMap.get(complement),i};
            }
            numMap.put(nums[i],i);
        }

        return new int[] {};  

        // method 3
        // Arrays.sort(nums);
        // int n=nums.length;

        // int left=0,right=n-1;

        // while(left<right){
        //     if((nums[left]+nums[right])==target){
        //         return new int[] {left,right};
        //     }
        //     else if((nums[left]+nums[right])<target){
        //         left++;
        //     }
        //     else{
        //         right--;
        //     }
        // }  
        // return new int[] {};
    }
}