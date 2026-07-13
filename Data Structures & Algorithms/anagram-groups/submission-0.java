class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            if(!map.containsKey(key)){  //If not found make a new list
                map.put(key,new ArrayList<>()); 
            }

            map.get(key).add(s);  //Else add the string to the list of sorted key 
        }

        return new ArrayList<>(map.values());
    }
}
