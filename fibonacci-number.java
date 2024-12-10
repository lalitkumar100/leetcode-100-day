class Solution {
    public int fib(int n) {
        int ft=0;
        int st=1;
         int tt=0;
         if(0==n){
            return 0;
         }
         else if(1==n){
            return 1;
         }
        for(int i=0;i<n-1;i++){
           tt=ft+st;
            ft=st;
            st=tt;
        }
        return tt;
    }
}
