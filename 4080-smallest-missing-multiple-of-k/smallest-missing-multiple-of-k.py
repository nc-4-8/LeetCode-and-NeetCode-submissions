class Solution(object):
    def missingMultiple(self, nums, k):
        inThere = set(nums)
        number = k
        while number in inThere:
            number+=k
        return number
        