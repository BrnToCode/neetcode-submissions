class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> freq=new HashMap<>();
        int low=0;
        int max=0;
        int maxFreq=0;
        int length=0;

        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            maxFreq = Math.max(maxFreq, freq.get(ch));

            while(((high-low+1)-maxFreq)>k){
                char left=s.charAt(low);
                freq.put(left,freq.get(left) - 1);
                low++;
            }
            
            length=high-low+1;
            max=Math.max(max,length);
        }
        return max;
    }
}
