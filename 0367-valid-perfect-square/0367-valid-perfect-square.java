class Solution {
    public boolean isPerfectSquare(int num) {
         int ans=(int)Math.pow(num,0.5);


        return ans*ans==num;
    }
}