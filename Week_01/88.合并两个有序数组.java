/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int rightIndex = m+n-1;
        while(n>0){
            if(m==0){
               nums1[n-1]=nums2[n-1];
               n--;

            }else{
                if(nums1[m-1]>nums2[n-1]){
                    nums1[rightIndex]=nums1[m-1];
                    m--;
                    
                }else{
                    nums1[rightIndex]=nums2[n-1];
                    n--;
    
                }
                rightIndex--;

            }
           
        }


    }
}
// @lc code=end

