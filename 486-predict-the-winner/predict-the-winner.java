class Solution {
    public boolean predictTheWinner(int[] nums) {
        return getScore(nums, 0, nums.length-1)>=0;
    }

    public int getScore(int[] nums, int i, int j){
        if(i == j){
            return nums[i];
        }

        int leftSide = nums[i] - getScore(nums, i+1, j);
        int rightSide = nums[j] - getScore(nums, i, j-1);

        return Math.max(leftSide, rightSide);
    }
}