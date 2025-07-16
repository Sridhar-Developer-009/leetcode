class Solution {
    public int reverse(int x) {
        long ans=0;
        int sign=1;
        if(x<0){
            sign=-1;
        }
    String p = String.valueOf(x);
    int index=p.length()-1;
    while(index>=0){ 
        if(p.charAt(index) != '-'){ ans=ans*10 +  (p.charAt(index)-'0');}
       
        index--;
    }
       if( ans > Integer.MAX_VALUE || (ans < Integer.MIN_VALUE)){
        ans=0;
    }
    ans=ans*sign;
    return (int) ans;
}
}