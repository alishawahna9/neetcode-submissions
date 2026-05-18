class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] counts1=new int[26];
        int[] counts2=new int[26];
        for(int i=0;i<s1.length();i++){
            counts1[s1.charAt(i)-'a']++;
            counts2[s2.charAt(i)-'a']++;
        }

        for(int k=0;k<=s2.length()-s1.length();k++){
            if(Arrays.equals(counts1,counts2)) return true;
            else{
                counts2[s2.charAt(k)-'a']--;
                if(k+s1.length()<s2.length()){
                    counts2[s2.charAt(k+s1.length())-'a']++;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

}
