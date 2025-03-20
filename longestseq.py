
class Solution(object):
    def longestConsecutive(self, nums):
        if(len(nums)==0):
            return 0
        nums.sort()
        print(nums)
        longestsequence=1
        maxseq=1
        for i  in range(0,len(nums)-1):
            if nums[i]+1==nums[i+1] or nums[i]==nums[i+1] :
                if(nums[i]+1==nums[i+1]):
                    maxseq+=1
                if maxseq > longestsequence:
                    longestsequence=maxseq
            else:
                maxseq=1
        return longestsequence



        """
        :type nums: List[int]
        :rtype: int
        """
        
