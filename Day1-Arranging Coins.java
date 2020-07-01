class Solution {
    public int arrangeCoins(int n) {
        if(n<0) 
            return -1;
        if(n==0) 
            return 0;
        int rows = 1;
        long sum = 0;
        while(sum<=n){
            sum += rows;
            if(sum<=n){
                rows++;   
            }
        }
        return rows-1;
    }
}
