class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<=0){
           return false;
       } 
       if(n!=1){
        if(n%2!=0){
            return false;
        }
       }
       while(n!=1){
         n =n/2;
         if(0!=n%2){
            if(n!=1){
                return false;
            }
         }
       }
       return true;
    }
}
