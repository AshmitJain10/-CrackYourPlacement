class Solution {
    
public String removeKdigits(String num, int k) {
        if (k == num.length()) {
            return "0";
        }
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < num.length()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        
        while (sb.toString().startsWith("0")) {
            sb.deleteCharAt(0);

        }
        return sb.length() == 0 ? "0" : sb.toString();
    }


}
