class Solution {
    public String defangIPaddr(String address) {
        
     address = address.replace(".","[.]");
     return address;
    }
    

    
    //replaceAll('.', '[.]'); replace . with [.]   String replaceString=s1.replace("is","was");
}