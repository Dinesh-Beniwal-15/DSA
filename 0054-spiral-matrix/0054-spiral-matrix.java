class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> ans=new ArrayList<>();

        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow && startcol<=endcol){
                //top
            for(int i=startcol;i<=endcol;i++){
                ans.add(matrix[startrow][i]);
            }

            //right
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }

            //bottom
            for(int i=endcol-1;i>=startcol;i--){
            if(startrow==endrow){
                break;
            }
                ans.add(matrix[endrow][i]);
            }

            //left
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol){
                    break;
                }
                ans.add(matrix[i][startcol]);
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        
        

        return ans;

    }
}