class Solution {
    public int removeDuplicates(int[] nums) {
    Set<Integer> set = new TreeSet<>();
        int i=0;
        while(i<nums.length){
            set.add(nums[i]);
            i++;
        }

          int j= 0;
        for (int num : set) {
            nums[j++] = num; // overwrite nums[] in-place
        }


        return set.size(); // number of unique elements
    }
}
