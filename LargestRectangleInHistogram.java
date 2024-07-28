class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack<Integer> st= new Stack<>();
        for(int i = 0 ; i<=n ; i++){
           int curr  = 0;
            if(i!=n){
                curr = heights[i];
            }else{
                curr=0;
            }
           while(!st.isEmpty() && curr<heights[st.peek()]){
            int top = st.pop();
            int wid = st.isEmpty()?i:i-st.peek()-1;
            int area = heights[top]*wid;
            max = Math.max(max,area);
           }
           st.push(i);
        }
        return max;
    }
}
