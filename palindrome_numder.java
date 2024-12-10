class Solution {
    public boolean isPalindrome(int x) {

        if(x<0){
            return false;
        }
        if(x==0){
            return true;
        }
  
        int re=0;
        int temp=x;
        while(temp!=0){
            re=re*10+temp%10;
            temp=temp/10;
        }
        if(re==x){
            return true;
        }
        
            return false;
    }
   
}
