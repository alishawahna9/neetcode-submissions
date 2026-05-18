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
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++) {
            // הוסף תו ימני ל-smap
            char c = s.charAt(right);
            smap.put(c, smap.getOrDefault(c, 0) + 1);

            // בדוק אם האות הזו מולאה
            if (tmap.containsKey(c) && smap.get(c).equals(tmap.get(c))) {
                have++;
            }

            // כווץ חלון משמאל כל עוד יש לנו את כל האותיות
            while (have == needed) {
                // עדכן מינימום
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                // הסר תו שמאלי מ-smap
                char leftChar = s.charAt(left);
                smap.put(leftChar, smap.get(leftChar) - 1);
                if (tmap.containsKey(leftChar) && smap.get(leftChar) < tmap.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }
}


