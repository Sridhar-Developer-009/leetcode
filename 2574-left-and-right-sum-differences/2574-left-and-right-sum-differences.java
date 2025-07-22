class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[]=new int[nums.length];
        int lsum=0;
        int rsum=0;
        int ksum=0;
        for(int i=1;i<nums.length;i++){
            rsum=rsum+nums[i];
        }    for(int i=0;i<nums.length-1;i++){
            ksum=ksum+nums[i];
        }
        for(int i=0;i<nums.length;i++){
        
         if(i==0){
            arr[i]=rsum;
         }
         else if(i==nums.length-1){
            arr[i]=ksum;
         }
         else{
                if(i<nums.length-1){
                  lsum=lsum+nums[i-1];
            }
            
            rsum=rsum-nums[i];
            arr[i]=Math.abs(lsum-rsum);

         }
        }

        return arr;
    }
}