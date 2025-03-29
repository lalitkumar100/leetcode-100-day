class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int i=0;
        int k=0;
        int l =n-1;
        int sum =0;
        while(i<n){
          sum +=mat[i][i++]+mat[k++][l--];
        }
        if(n%2==1){
            sum-=mat[n/2][n/2];
        }
        return sum;
        
    }
}
