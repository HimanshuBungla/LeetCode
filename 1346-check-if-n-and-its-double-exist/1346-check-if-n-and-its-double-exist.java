class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int a = 2*arr[i];
            for(int j=i+1;j<arr.length;j++){
                int b = 2*arr[j];
                if(b==arr[i]){
                    return true;
                }
                if(a==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}