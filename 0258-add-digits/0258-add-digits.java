class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int r =0;
            while(num > 0){
                r += num%10;
                num /= 10;
            }
            num = r;
        }

        return num;

    }
}