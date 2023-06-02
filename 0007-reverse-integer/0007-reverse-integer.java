class Solution {
    public int reverse(int x) {
        boolean n = false;
        if (x < 0) {
            n = true;
            x = -x;
        }
        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        if (rev > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (n ? -rev : rev);
    }
}