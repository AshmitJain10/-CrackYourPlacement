class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String[] p = path.split("/");
        for(int i = 0;i<p.length;i++){
            if(!st.empty() && p[i].equals("..")){
                st.pop();
            }
            else if(!p[i].equals(".") && !p[i].equals("") && !p[i].equals("..")){
                st.push(p[i]);
            }
        }
        List<String> ls = new ArrayList(st);
        return "/"+String.join("/",ls);
    }
}
