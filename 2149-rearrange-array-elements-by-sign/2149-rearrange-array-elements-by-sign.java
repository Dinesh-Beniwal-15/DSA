class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;

        int[] pos=new int[n/2];
        int[] neg=new int[n/2];

        int p1=0;
        int n1=0;
        for(int itr=0;itr<n;itr++){
            if(nums[itr]>0){
                pos[p1]=nums[itr];
                p1++;
            }
            else{
                neg[n1]=nums[itr];
                n1++;
            }
        }

        int p2=0;
        int n2=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=pos[p2];
                p2++;
            }
            else{
                nums[i]=neg[n2];
                n2++;
            }
        }
        return nums;
    }
}