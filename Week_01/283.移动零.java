/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int indexZero=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0 && indexZero!=-1){
                nums[indexZero]=nums[i];
                nums[i]=0;
                indexZero++;
            }else if(nums[i]==0 && indexZero==-1){
                indexZero=i;
            }
        }

    }
}
// @lc code=end

