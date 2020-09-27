
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int[] a =new int[2];
        for(int j=0;j<=nums.length; j++) {
            int dis = target -nums[j];
            if(map.containsKey(dis) && map.get(dis)!=j){
                a[0]=j;
                a[1]=map.get(dis);
                break;
            }
        }
        return a;
    }
}
// @lc code=end

