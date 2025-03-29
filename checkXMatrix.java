class Solution {
    public boolean checkXMatrix(int[][] grid) {
          int n = grid.length;
        int p=0;
        int k=0;
        int l =n-1;
    
        while(p<n){
          if(0==grid[p][p]||0==grid[k][l])
          return false;
          grid[p][p]=-1;
          grid[k][l]=-1;
          p++;
          k++;
          l--;
          
        }
        for(int i =0;i<n;i++)
        for(int j =0;j<n;j++){
          
           if(grid[i][j]!=-1){
            if(grid[i][j]!=0)
            return false;
           }
        }
        return true;
        
    }
}
