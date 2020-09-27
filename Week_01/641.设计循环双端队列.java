/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start
class MyCircularDeque {
    private  int[] queueList;
    private  int front_index;
    private  int last_index;
    private  int captity;
    private int size;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        front_index=0;
        last_index =0;
        queueList = new int[k];
        captity =k;
        size=0;

    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(size==captity && front_index==last_index){
            return false;
        }else{
            front_index = (front_index-1+captity)%captity;
            queueList[front_index] = value;
            size++; 
            return true;
        }

    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(size==captity && front_index==last_index){
            return false;
        }else{
            queueList[last_index] = value;
            last_index = (last_index+1+captity)%captity;
            size++;
            return true;
        }
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(size==0 && front_index ==last_index){
            return false;
        }
        front_index = (front_index+1)%captity;
        size--;
        return true;

    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(size==0 && front_index ==last_index){
            return false;
        }
        last_index = (last_index-1+captity)%captity;
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(size==0 && front_index ==last_index){
            return -1;
        }
        return queueList[front_index];

    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(size==0 && front_index ==last_index){
            return -1;
        }
        return queueList[(last_index-1+captity)%captity];

    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;

    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(size==captity){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

