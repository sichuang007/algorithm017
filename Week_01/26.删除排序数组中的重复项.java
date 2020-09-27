/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if(length<=1){
            return length;
        } 
        int count =1;
        int compare = nums[0];
        for(int i=1;i<length;i++){
            if(nums[i]!=compare){     
                nums[count]=nums[i];
                compare = nums[i];               
                count++;
            }
        }
        return count;

    }
}
// @lc code=end

