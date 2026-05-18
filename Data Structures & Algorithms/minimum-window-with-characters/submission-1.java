class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";

        // ספור תדירות אותיות ב-t
        Map<Character, Integer> tmap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> smap = new HashMap<>();
        int needed = tmap.size(); // כמה אותיות שונות צריך
        int have = 0;             // כמה אותיות כבר מולאו
        int left = 0;
        int minLeft=0;
        int minLen=Integer.MAX_VALUE;

        for(int right=0;right<s.length();right++){

            char c=s.charAt(right);
            smap.put(c,smap.getOrDefault(c, 0)+1);

            if(tmap.containsKey(c)&&(tmap.get(c).equals(smap.get(c)))){
                have++;
            }

            while(have==needed){
                char k=s.charAt(left);

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }
                smap.put(k, smap.getOrDefault(k, 0) - 1);

                if(tmap.containsKey(k)&&smap.get(k)<tmap.get(k)){
                    have--;
                }
                left++;
            }
        }

        if(minLen==Integer.MAX_VALUE){
            return "";
        }

        else return s.substring(minLeft,minLeft+minLen);

    }
}


