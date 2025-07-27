class Solution {
    public int findDuplicate(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            ans=nums[i];
            break;
        }
        set.add(nums[i]);
       }
       return ans;
    }
}