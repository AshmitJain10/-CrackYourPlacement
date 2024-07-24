class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s = 0;
        int c = 0;
        int res = 0;
        int total= 0;
        for(int i = 0 ; i<gas.length ; i++){
            s+=gas[i];
            c+=cost[i];
        }
        if(s<c){
            return -1;
        }
        for(int i = 0 ; i<gas.length ; i++){
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                res = i+1;
            }
        }
        return res;
    }
}
