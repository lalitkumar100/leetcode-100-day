class Solution {
    public int maxProduct(int[] nums) {
        
         Arrays.sort(nums);
         for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
         }
     int i =nums.length-1;
          System.out.println(nums[i]);
               System.out.println(nums[i-1]);
                System.out.println((nums[i-1]-1)*(nums[i]-1));
     return ((nums[i]-1)*(nums[i-1]-1));
}
}
