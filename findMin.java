class Solution {
    public int findMin(int[] nums) {
        int start =0;
        int end =nums.length-1;
        int mid=-1;
   
        while(start<=end){
            mid =(start+end)/2;
            if(nums[start]<nums[end]){
                return nums[start];
            }
            else{
                if(nums[mid]<nums[start]){
                    end=mid;
                }
                else{
                     start =mid+1;
                }
            }

        }
        return nums[mid];
    }
}
