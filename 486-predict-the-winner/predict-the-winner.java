class Solution {
    public boolean predictTheWinner(int[] nums) {
        return getScore(nums, 0, nums.length-1)>=0;
    }

    public int getScore(int[] nums, int i, int j){
        if(i == j){
            return nums[i];
        }

    return Math.max(
    nums[i] - getScore(nums, i + 1, j),
    nums[j] - getScore(nums, i, j - 1)
);
    }
}