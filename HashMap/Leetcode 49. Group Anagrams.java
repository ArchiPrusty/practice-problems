/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map=new HashMap<>();
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        for(String s : strs){
            int count[] = new int[26];
            for(char c : s.toCharArray()){
                count[c-'a']++;            //Convert char → index (0 to 25).
            }
            StringBuilder sb = new StringBuilder();
            for(int i : count){
                sb.append("#");         //Build unique key from frequency array.
                sb.append(i);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key , new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }   
}
