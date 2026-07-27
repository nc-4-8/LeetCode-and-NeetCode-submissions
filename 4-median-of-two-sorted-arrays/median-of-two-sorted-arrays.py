class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        nums3 = sorted(nums1 + nums2)
        length = len(nums3)

        if length % 2 == 1:
            return nums3[length // 2]
        else:
            half1 = nums3[length // 2 - 1]
            half2 = nums3[length // 2]
            return (half1 + half2) / 2.0