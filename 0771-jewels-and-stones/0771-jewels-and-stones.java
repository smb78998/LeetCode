class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        
        for(int i = 0 ; i <= (stones.length()-1) ; i++  ){
            
            int j = 0;
            while( j <= (jewels.length()-1) ){
                
                if ( (jewels.charAt(j)) == (stones.charAt(i)) ){
                    count++;
                }else{
                    
                }
                
                j++;
            }
        }
        
        return count;
        
    }
}



//jewels.charAt(j) == jewels.charAt(i)