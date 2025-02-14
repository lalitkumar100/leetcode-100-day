class Solution {
    public int singleNonDuplicate(int[] nums) {
    
    int start =0;
    int end = nums.length-1;

    if(end==0){
        return nums[0];
    }
    if(nums[start]!=nums[start+1]){
        return nums[start];
    }
    else if(nums[end]!=nums[end-1]){
        return nums[end];
    }
    start++;
    end--;
    while(start<=end){
     int   mid=(start+end)/2;
     System.out.println("mid"+nums[mid]);

        if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]){
            return nums[mid];
        }
        if(mid%2==0){
            if(nums[mid]!=nums[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        else{
              if(nums[mid]!=nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
    }
    return -1;

    }
}
