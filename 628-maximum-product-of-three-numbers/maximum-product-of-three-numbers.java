class Solution {
    public int maximumProduct(int[] nums) {
        int productOne = 0;
        int productTwo = 0;
        int length = nums.length;
        Arrays.sort(nums);

        productOne = nums[0]*nums[1]*nums[length-1];
        productTwo = nums[length-1]*nums[length-2]*nums[length-3];

        if(productOne>productTwo){
            return productOne;
        }
        else{
            return productTwo;
        }
     
    }
}