class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int s = 0;
        int e = arr.length;
        while (s + 1 < e && arr[s] < arr[s + 1]){
            s++;
        }
        int maxi = Arrays.stream(arr).max().getAsInt();
        if(arr[s]!=maxi){
            return false;
        }
        if(s==0||s==e-1){
            return false;
        }
        while (s + 1 < e && arr[s] > arr[s + 1]){
            s++;
        }
        
        return s==e-1;
    }
}