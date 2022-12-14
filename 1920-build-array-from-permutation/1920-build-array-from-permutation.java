class Solution {
    public int[] buildArray(int[] nums) {

        //varibles 
        int[] mid = new int[nums.length];
        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){
            mid[i] = nums[i];
        }

        for(int i = 0 ; i < nums.length ; i++){
            ans[i] = nums[mid[i]];
        }
        return ans; 
    }
}