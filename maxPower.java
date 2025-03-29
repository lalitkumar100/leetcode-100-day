class Solution {
    public int maxPower(String s) {
        
      if(s.length()==0){
        return 0;
      }
      if(s.length()==1){
        return 1;
      }
      int maxlen =1;
      int count=1;
      int n =s.length();
      for(int i=1;i<n;i++){
    
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
          
            if(maxlen<count) maxlen=count;
        }
        else{
            count=1;
        }
      }
      return maxlen;

    }
}
