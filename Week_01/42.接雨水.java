import java.util.Stack;

/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) { 
        int left_max=0;
        int right_max=0;
        int left_index=0;
        int right_index = height.length-1;
        int area=0;
        while(left_index<right_index){
            if(height[left_index]<height[right_index]){
                if(height[left_index]>=left_max){
                    left_max = height[left_index];

                }else{
                    area = area+(left_max -height[left_index]);                   
                }
                left_index++;
            }else{
                if(height[right_index]>=right_max){
                    right_max = height[right_index];

                }else{
                    area = area+ (right_max - height[right_index]);
                }
                right_index--;
            }
        }
        return area;
        

        // // //使用栈方式45.21%， 16.48%
        // Stack<Integer> stack= new Stack<>();
        // int area=0;
        // int left_max=0;    
        // for(int i=0;i<height.length;i++){
        //     int tem_heigth=0;
        //     if(height[i]<left_max){
        //         stack.push(i);
        //     }else{
        //         while(!stack.empty()){
        //             tem_heigth = tem_heigth+(left_max-height[stack.pop()]);
        //         }   
        //         stack.push(i);
        //         left_max= height[i];
        //     }
        //     area = area+tem_heigth;
        // }

        // int tem=0;
        // while(!stack.empty()){
        //     if(tem>height[stack.peek()] &&  tem<left_max){
        //         area= area+(tem-height[stack.pop()]);
        //     }else{
        //         tem = height[stack.pop()];
        //     }
        // }
        // return area;
    }
}
// @lc code=end

