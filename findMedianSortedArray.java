class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
  
      int m =nums1.length;
      int n= nums2.length;
      int p1=0,p2=0;
      int i =0;
      int[] nums =new int[m+n];
        
        while(i<m+n){
          System.out.println("i ="+i);
        if(p1<m&&p2<n){
             System.out.println("1");
            if(nums1[p1]>nums2[p2]){
                System.out.println("1 -2 is add "+nums2[p2]);
                nums[i]=nums2[p2++];
                //  System.out.println("1 -2 is now "+nums2[p2]);
            }
            else{
                 System.out.println("1 -1 is add "+nums1[p1]);
             nums[i]=nums1[p1++]; 
            //   System.out.println("1 -1 is now  "+nums1[p1]);
            }
        }
        else if(p1<m){
               System.out.println("2 is add "+nums1[p1]);
            nums[i]=nums1[p1++]; 
        }
        else{
              System.out.println("3 is add "+nums2[p2]);
           nums[i]=nums2[p2++]; 
        }
        i++;
        }

        for(int j=0;j<m+n;j++)
          System.out.println(nums[j]);

        int middle=(m+n)/2;
        
        float median=0;
        if((m+n)%2==0){
            median =nums[middle]+nums[middle-1];
            median=median/2.0f;
        }
        else{
            median =nums[middle];
          
        }
        return median;
        
    }
}
