class Solution {
        public int lengthOfLongestSubstring(String s) {
        int n = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {
                String a = s.substring(i, j);
                String b = "";
                boolean isSimple = true;
                for(int k = 0; k < a.length(); k++) {
                    String tmp = a.substring(k, k +1);
                    if (b.contains(tmp)) {
                        isSimple = false;
                    } else {
                        b += tmp;
                    }
                }
                if (isSimple) {
                    if (a.length() > n) {
                        n = a.length();
                    }
                }
            }
        }
        return n;
    }
}
