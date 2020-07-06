class Solution {
    public int hammingDistance(int x, int y) {
        int difference = 0;
        while(x > 0 || y > 0) {
            if(y % 2 != x % 2) 
                difference++;
            x /= 2;
            y /= 2;
        }
        return difference;
    }
}
