class Solution {
    public int dominantIndex(int[] nums) {
       int max=0,smax=0; 
       int maxindex=-1;

     for(int i=0;i<nums.length;i++){
        if(max<nums[i]){
        smax =max;
         max= nums[i];
         maxindex =i;
        }
        else if(smax<nums[i]){
          smax=nums[i];
        }
      
       
     }
       if(2*smax>max){
            return -1;
          }
      return maxindex;
}
}
