
/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
 
        ListNode listnew =new ListNode(-1) ;
        ListNode list = listnew;
        while(l1!=null && l2!=null){
            
                if(l1.val<l2.val){
                    list.next=l1;
                    l1=l1.next;
                }else{
                    list.next = l2;
                    l2=l2.next;
                }
                list = list.next;   
                             
        }
        list.next = l1==null?l2:l1;
        
   
        return listnew.next;     
    }
}
// @lc code=end

