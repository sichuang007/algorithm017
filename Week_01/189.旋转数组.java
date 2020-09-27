/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 旋转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) { 
        if(nums.length<=1){
            return;

        }
        k = k%nums.length;
        int[] numsreverse = reverse(nums,0,nums.length-1);
        int[] leftReverse = reverse(numsreverse, 0, k-1);
        int[] rightReverse = reverse(leftReverse, k, leftReverse.length-1);

    }

    private int[] reverse(int[] nums, int i, int j) {
        while(j>i){
            int tem = nums[i];
            nums[i] = nums[j];
            nums[j] = tem;
            i++;j--;

        }
        return nums;
    }
}
// @lc code=end

