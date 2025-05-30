class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
if(matrix.length==1 && target== matrix[0][0]){
    return true;
}

        for(int i=0;i<matrix.length;i++){
            if(target <=matrix[i][matrix[i].length-1]){
              for(int j=0;j<matrix[i].length;j++){
                    if(target==matrix[i][j]){
                        return true;
                    }
              }  
            }
            
        }
        return false;
    }
}