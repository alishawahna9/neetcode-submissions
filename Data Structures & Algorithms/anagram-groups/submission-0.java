class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> list=new HashMap<>();

        for(String str:strs){
            int[] count=new int[26];

            for(int i=0;i<str.length();i++){
                count[str.charAt(i)-'a']++;
            }

            String key=Arrays.toString(count);

            if(list.containsKey(key)){
                list.get(key).add(str);
            }
            else{
                list.put(key,new ArrayList<>());
                list.get(key).add(str);
            }
        }

        return new ArrayList<>(list.values());
    }
}
