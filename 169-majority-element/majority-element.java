class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> base = new HashMap<>();

        for(int num : nums){
            base.put(num, base.getOrDefault(num,0)+1);
            if(base.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}