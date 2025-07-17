class Solution  {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        int i = 0; // Pointer for needle
        int start = 0; // Starting index in haystack

        for (int j = 0; j < haystack.length(); j++) {
            if (haystack.charAt(j) == needle.charAt(i)) {
                if (i == 0) start = j;  // potential start of match
                i++;

                if (i == needle.length()) {
                    return start;  // full match found
                }
            } else {
                if (i > 0) {
                    j = start; // restart from next char after previous match start
                }
                i = 0; // reset needle pointer
            }
        }

        return -1;
    }
}
