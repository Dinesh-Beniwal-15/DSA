class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}