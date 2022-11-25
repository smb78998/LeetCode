class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[ (2 * n ) ];
        int i = 0;
        
           
	    for(int j = 0 ; j < 2*n ; j++){
	   
	            ans[j] = nums[i];
	            i++;
	            
	            if(i >= n){
	               i = 0;
	            }
	        
	    }
            
        return ans;
    }
}