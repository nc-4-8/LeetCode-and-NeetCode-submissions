class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        check = False
        numberMap = {}
        for num in nums:
            numberMap[num] = numberMap.get(num,0) + 1
        
        for iter in numberMap.values():
            if(iter>1):
                check = True
        return check

        