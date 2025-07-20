class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        myset = list(set(nums))
        muset = myset.sort()
        nums[:] = myset
        return len(myset)
        