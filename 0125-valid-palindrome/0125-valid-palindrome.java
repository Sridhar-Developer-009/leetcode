class Solution {
    public boolean isPalindrome(String s) {
            String ans=s.trim();
           String a= ans.toLowerCase();
           String n="";
        for(int i=0;i<a.length();i++){
          if((a.charAt(i)>='a' && a.charAt(i)<='z') ||(a.charAt(i)>='0' && a.charAt(i)<='9')){
           n = n + a.charAt(i);
          }
        }

   

        int left=0;
        int right=n.length()-1;
        boolean out=true;

        while(left<right){
            if(n.charAt(left)==n.charAt(right)){
                left++;
                right--;
            }
            else{
                out=false;
                break;
            }
        }
        return out;

        
        
    }
}