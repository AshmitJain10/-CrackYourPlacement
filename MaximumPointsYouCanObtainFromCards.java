class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length-1;
        int sum = 0;
        int max = 0;
        int l =k-1;
        for(int i = 0 ; i<k ; i++){
            sum+=cardPoints[i];
        }
        max =sum;
        for(int i = 0 ; i<k ; i++){
            sum -= cardPoints[l--];
            sum += cardPoints[n--];
            max = Math.max(sum,max);
        }
        return max;
    }
}
