class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = 1
        nums = set(nums)
        for i in range(len(nums)):
            if n in nums:
                n += 1
            else:
                break
        return n