class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int arr[]=new int[2];
        // int n=numbers.length;
        // int low=0;
        // int high=n-1;
        
        // while(low<high){
            
        //     int sum=numbers[low]+numbers[high];

        //     if(sum==target){
        //         arr[0]=low+1;
        //         arr[1]=high+1;
        //         break;
        //     }
        //     else if(sum<target){
        //         low++;
        //     }
        //     else{
        //         high--;
        //     }
            
        // }
        // return arr;
        int n=numbers.length;
        int left=0,right=n-1;

        while(left<right){
            if((numbers[left]+numbers[right])==target){
                return new int[] {left+1,right+1};
            }
            else if((numbers[left]+numbers[right])<target){
                left++;
            }
            else{
                right--;
            }
        }  
        return new int[] {};
    }
}