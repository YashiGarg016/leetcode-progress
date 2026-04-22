# Last updated: 23/04/2026, 00:06:22
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return reduce(xor, nums)
        