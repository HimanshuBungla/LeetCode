class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long sum1 = 0;
        long min1 = 0;
        long max1 = 0;
        for(int i:differences){
            sum1 += i;
            min1 = Math.min(min1,sum1);
            max1 = Math.max(max1,sum1);
        }
        return (int) Math.max(0, (upper - lower) - (max1 - min1) + 1);
    }
}