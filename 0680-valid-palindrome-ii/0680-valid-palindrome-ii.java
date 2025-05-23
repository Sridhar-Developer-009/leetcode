class Solution {
    public boolean validPalindrome(String s) {
        char[] ch=s.toCharArray();
        
        int l=0;
        int r=ch.length-1;
        while(l<r){
            if(!(ch[l]==ch[r]) ){
                if(l==r-1){
                    return true;
                }
                return false;
            }
            l++;
            r--;
        }

    return true;
    }
}