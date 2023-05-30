class Solution {
    public static boolean powerOfTwo(int n)
    {
        if(n>0){
            while(n % 2 == 0)
            n /= 2;
            return (n == 1);
        }
        else{
            return n==1;
        }
    }
        
    public boolean isPowerOfTwo(int n) {
        if(powerOfTwo(n))
            return true;
        else
            return false;
}
}