class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> smap=new HashMap<>();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            smap.put(c,smap.getOrDefault(c,0)+1);
        }
        int curr;
        for(int j=0;j<t.length();j++){
            c=t.charAt(j);
            if(smap.containsKey(c)){
                curr=smap.get(c);
                smap.put(c,curr-1);
                if(smap.get(c)==0){
                    smap.remove(c);
                }
            }
            else{
                return false;
            }
        }
    return smap.isEmpty();

    }
}
