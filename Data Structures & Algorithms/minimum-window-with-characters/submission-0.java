// class Solution {
//     public String minWindow(String s, String t) {
//         HashMap<Character,Integer> t_map=new HashMap<>();
//         HashMap<Character,Integer> s_map=new HashMap<>();
//         StringBuilder res=new StringBuilder();
//         String result="";

//         for(char ch:t.toCharArray()){
//             t_map.put(ch,t_map.getOrDefault(ch,0)+1);
//         }

//         int left=0;

//         for(int right=0;right<s.length();right++){
            
//             char ch=s.charAt(right);
//             s_map.put(ch,s_map.getOrDefault(ch,0)+1);
//             while(t_map.get(ch)==s_map.get(ch)){

//                 char left=s.charAt(left);
//                 s_map.put(left,s_map.get(left)-1);
//                 left++;

//                 if(s_map.get(left)==0){
//                     s_map.remove(left);
//                 }
//             }
//             res.append(s.charAt(right));
//         }
//         result=res.toString();
//         return result;
//     }
// }


class Solution {
    public String minWindow(String s, String t) {
        int res=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        int start=0;
        int len=0;

        int[] need=new int[256];
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            need[ch]++;
        }

        int[] have=new int[256];

        for(high=0;high<s.length();high++){
            char ch=s.charAt(high);
            have[ch]++;

            while(Iscorrect(have,need)){
                len=high-low+1;
                if(res>len){
                    res=len;
                    start=low;
                }
                have[s.charAt(low)]--;
                low++;
            }
        }
        return res==Integer.MAX_VALUE?"":s.substring(start,start+res);
    }

    public boolean Iscorrect(int[] have,int[] need){
        for(int i=0;i<256;i++){
            if(have[i] < need[i]){
                return false;
            }
        }
        return true;
    }
}
