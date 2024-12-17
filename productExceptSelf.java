class Solution {
    public int[] productExceptSelf(int[] nums) {
          int [] res = new int[nums.length];
          
           int proL =1;
           int proR =1;
          for(int i=0;i<nums.length;i++){
            res[i]=proL;
            proL*=nums[i];
          }
          for(int i=nums.length-1;i>=0;i--){
            res[i]=proR*res[i];
            proR*=nums[i];
          }
          return res;

          
    }
}
