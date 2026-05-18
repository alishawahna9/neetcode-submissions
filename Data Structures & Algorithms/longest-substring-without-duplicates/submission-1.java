class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int max=1;
        int left=0;
        Set<Character> set=new HashSet<>();
        set.add(s.charAt(0));
        for(int curr=1;curr<s.length();curr++){
            while(set.contains(s.charAt(curr))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(curr));

            if(curr-left+1>max){
                max=curr-left+1;
            }
        }
        return max;
    }
}
