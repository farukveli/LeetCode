class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for i in range(0,len(nums)-1):
            for j in range(i+1,len(nums)):
                if (target - nums[i]) == nums[j]:
                    return [i,j]
        return null