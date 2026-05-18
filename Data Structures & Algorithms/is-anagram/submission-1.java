class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> smap=new HashMap<>();
        Map<Character,Integer> tmap=new HashMap<>();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            smap.put(c,smap.getOrDefault(c,0)+1);
        }

        for(int j=0;j<t.length();j++){
            c=t.charAt(j);
            tmap.put(c,tmap.getOrDefault(c,0)+1);
        }

        for(Character k:smap.keySet()){
            if(smap.containsKey(k)&&tmap.containsKey(k)&&smap.get(k).equals(tmap.get(k))){
                continue;
            }
            else{
                return false;
            }
        }

        return true;

    }
}
