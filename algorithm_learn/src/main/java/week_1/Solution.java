package week_1;

class Solution {
    public int removeDuplicates(int[] nums) {
        //重复 判断依据: nums[i]!nums[i-1]
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            if(i==0||(nums[i]!=nums[i-1])){
                nums[n]=nums[i];
                n++;
            }
        }
        return n;
    }
}