class Solution {
    public int[] sortedSquares(int[] nums) {
    
     int start=0;
     int end =nums.length-1;
     int[] newnums= new int[nums.length];
     int i=end;
     while(start<=end){
        int ns =nums[start]*nums[start];
        int ne =nums[end]*nums[end];
        System.out.println("start="+start+" "+"end="+end);
        if(ns>ne){
            newnums[i--]=ns;
            System.out.println(newnums[i+1]);
            start++;
        }
        else{
            
          newnums[i--]=ne;
          System.out.println(newnums[i+1]);
            end--;  
        }
    }
     return newnums;
 
    }
}
