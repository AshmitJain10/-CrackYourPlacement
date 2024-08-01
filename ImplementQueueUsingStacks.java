class MyQueue {
    Stack<Integer> popS ;
    Stack<Integer> pushS;
    public MyQueue() {
        popS = new Stack<Integer>();
        pushS = new Stack<Integer>();
    }
    
    public void push(int x) {
        pushS.push(x);
    }
    
    public int pop() {
        if(popS.isEmpty()){
            while(!pushS.isEmpty()){
                popS.push(pushS.pop());
            }
        }
       return popS.pop();
    }
    
    public int peek() {
        if(popS.isEmpty()){
            while(!pushS.isEmpty()){
                popS.push(pushS.pop());
            }
        }
        return popS.peek();
    }
    
    public boolean empty() {
        return pushS.isEmpty() && popS.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
