class Solution {
    public boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int low=0;
        int high=res.length()-1;
            while(low<high){
                if(res.charAt(low)!=res.charAt(high)){
                    return false;
                   
                }
                low++;
                high--;
            }
        return true;
    }
}
