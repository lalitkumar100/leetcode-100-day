class Solution {
    public int findDuplicate(int[] nums) {
    HashSet<Integer> numset =  new HashSet<>();

     for(int i=0;i<nums.length;i++){
        if(!numset.contains(nums[i]))
        numset.add(nums[i]);
        else
          return nums[i];
     }
     return -1;
    }
    
}
