class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        else{
            int s = 0, e = arr.length - 1;
            while (s + 1 < e && arr[s] < arr[s + 1]) {
                ++s;
            }
            while (e - 1 > 0 && arr[e] < arr[e - 1]) {
                --e;
            }
            return s == e;
        }
}
}