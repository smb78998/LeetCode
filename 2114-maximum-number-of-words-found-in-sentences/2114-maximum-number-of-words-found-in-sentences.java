class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int count = 0 ;
        int newCount = 0;

        for(int i = 0 ; i < sentences.length ; i++ ) {

            for(int j = 0 ; j <sentences[i].length() ; j++) {

                if (sentences[i].charAt(j) == ' ') {
                    newCount ++;
                }
            }
            newCount++;
                
                if(newCount >= count){
                    count = newCount; 
                }
              newCount = 0;
        }
        
        return count; 
    }
}