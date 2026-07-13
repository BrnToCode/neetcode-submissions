class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        int start=0;
        int max=0;

        for(int num:nums){
            set.add(num);
        }

        for(int num:nums){
            if(!set.contains(num-1)){ //Tells the starting number of the sequence

                start=num;
                int length=1; 

                while(set.contains(start+1)){  //Checks for sequence for the starting number
                    start++;
                    length++;
                }
                max=Math.max(max,length);
            }
            
        }

        return max;
    }
}
