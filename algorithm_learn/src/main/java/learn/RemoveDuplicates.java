package learn;


/**
 * LC  26
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 *
 *
 */
//删除有序数组中的重复项
public class RemoveDuplicates {
    public static void main(String[] args) {

        int [] nums={1,2,2,4};
        int n = new Solution().removeDuplicates(nums);
       // System.out.println(n);
    }



}

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
