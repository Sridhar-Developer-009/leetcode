class Solution  {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;
        String a=haystack;
        String b=needle;
        char first=b.charAt(0);

        for(int i=0;i<a.length();i++){
            if(first==a.charAt(i)){
                if(i+b.length()-1 < a.length()){
                if(b.equals(a.substring(i, i + b.length()))){
                    return i;
                }
                }
            }
        }

        return -1;
       
    }
}
