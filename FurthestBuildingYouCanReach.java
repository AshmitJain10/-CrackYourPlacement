class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> ladderclimbs = new PriorityQueue<>();
        for(int i = 01 ; i<n ; i++){
            int climb = heights[i]-heights[i-1];
            if(climb<=0){
                continue;
            }
            ladderclimbs.add(climb);
            if(ladderclimbs.size()<=ladders){
                continue;
            }
            if((bricks-=ladderclimbs.poll())<0){
                return i-1;
            }
        }
        return n-1;
    }
}
