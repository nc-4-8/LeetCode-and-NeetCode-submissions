class Solution {
    public int[] twoSum(int[] nums, int target) {
         int b = 0;
         int c = 0;
         int d = 0;
        for(int i =0; i<nums.length-1; i++){
            for(int j = i+1;j<nums.length;j++){
                b=nums[i]+nums[j];
                if(b==target){
                   c=i;
                   d=j; 
                } 
            }
        }
        int a[]={c,d};
        return a;
    }
}