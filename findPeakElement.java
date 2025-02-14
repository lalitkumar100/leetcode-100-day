class Solution {
    public int findPeakElement(int[] nums) {

        int start =0;
        int end = nums.length-1;
        if(end==0){
            return 0;
        }

        if(nums[start]>=nums[start+1]){
            return start;
        }
        else if(nums[end]>=nums[end-1]){
            return end; 
        }
        else{
            start++;
            end--;
            while(start<=end){
             int mid =(start+end)/2;
             if(nums[mid]>=nums[mid+1]&&nums[mid]>=nums[mid-1]){
                return mid;
             }
             if(nums[mid]<nums[mid+1]){
                  start=mid+1; 
             }
             else if(nums[mid]<nums[mid-1]) {
                end =mid-1;
             }
            }
        }
        return -1;
    }
}
