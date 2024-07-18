class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if(matrix.length==0){
            return ans;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int rows = 0;
        int rowe = n-1;
        int cols = 0;
        int cole = m-1;

        while(rows<=rowe && cols<=cole){
            for (int i = cols; i <=cole ; i++) {
                ans.add(matrix[rows][i]);
                }
                    rows+=1;
            
            for (int i = rows; i <=rowe ; i++) {
                ans.add(matrix[i][cole]);
            }
        
            cole-=1;
        
            if(rows<=rowe){
                for (int i = cole; i >=cols ; i--) {
                    ans.add(matrix[rowe][i]);
                    
                }
            }
            rowe-=1;
            if(cols<=cole){
                for (int i = rowe; i >=rows ; i--) {
                    ans.add(matrix[i][cols]);
                    
                }
            }
            cols+=1;
        }
        return ans;
    }
}
