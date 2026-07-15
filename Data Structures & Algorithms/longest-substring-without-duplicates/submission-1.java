class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> freq=new HashSet<>();
        int low=0;
        // int high=0;
        int length=0;
        int max=0;
        
        for(int high=0;high<s.length();high++){
            while(freq.contains(s.charAt(high))){
                freq.remove(s.charAt(low));
                low++;
            }
            freq.add(s.charAt(high));
            length=high-low+1;
            max=Math.max(max,length);
        }
        return max;
    }
}
