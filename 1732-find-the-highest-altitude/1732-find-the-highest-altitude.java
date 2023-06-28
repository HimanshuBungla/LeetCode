class Solution {
    public int largestAltitude(int[] gain) {
        int ma=0;
        int alt=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            if(ma>alt){
                ma=ma;
            }
            else{
                ma=alt;
            }
        }
        return ma;
    }
}