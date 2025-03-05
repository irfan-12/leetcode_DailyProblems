class Solution {
    public long coloredCells(int n) {
    long val = n+(n-1);
    long res = 0;
    while(val>0){
        res += val;
        val -= 2;

    }
    return (res*2)-(n+(n-1));
    }

}