/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int flag=0;
        

        while(length>0){
            int plusone = digits[length-1]+1;
            int i = plusone%10;
            flag= plusone/10;
            digits[length-1]=i;
            if( plusone/10==0){
                break;

            }else{
                length--;
            } 
        }
        if(flag!=0){
            int[] tem = new int[1+digits.length];
            tem[0]=1;
            return tem;
        }
        return digits;

    }
}
// @lc code=end

