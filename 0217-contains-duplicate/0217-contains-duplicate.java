import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        
        HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
        
      boolean duplicate = false;
        
      
        	 for(int i = 0 ; i < nums.length ; i++){
                 numbers.put(nums[i], 0);
             }
        	 
        	 for(int i = 0 ; i < nums.length ; i++){
        		 
        		 if (numbers.containsKey(nums[i]) == true) {
        			 numbers.put(nums[i], numbers.get(nums[i]) + 1);
        		 }
        		 
        		 if(numbers.get(nums[i])>=2) {
        			 duplicate = true;
        			 break;
        		 }
        	 }
       return duplicate;
    }
}