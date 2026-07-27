class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merged = sorted(nums1 + nums2)
        length = len(merged)

        if length % 2 == 1:
            return merged[length // 2]
        else:
            half1 = merged[length // 2 - 1]
            half2 = merged[length // 2]
            return (half1 + half2) / 2.0