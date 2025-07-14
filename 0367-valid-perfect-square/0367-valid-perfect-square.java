class Solution {
    public boolean isPerfectSquare(int num) {
         double ans=Math.pow(num,0.5);
        double a=ans*10;
        int b= (int) (ans);
        int c= b*10;

        return a==c;
    }
}