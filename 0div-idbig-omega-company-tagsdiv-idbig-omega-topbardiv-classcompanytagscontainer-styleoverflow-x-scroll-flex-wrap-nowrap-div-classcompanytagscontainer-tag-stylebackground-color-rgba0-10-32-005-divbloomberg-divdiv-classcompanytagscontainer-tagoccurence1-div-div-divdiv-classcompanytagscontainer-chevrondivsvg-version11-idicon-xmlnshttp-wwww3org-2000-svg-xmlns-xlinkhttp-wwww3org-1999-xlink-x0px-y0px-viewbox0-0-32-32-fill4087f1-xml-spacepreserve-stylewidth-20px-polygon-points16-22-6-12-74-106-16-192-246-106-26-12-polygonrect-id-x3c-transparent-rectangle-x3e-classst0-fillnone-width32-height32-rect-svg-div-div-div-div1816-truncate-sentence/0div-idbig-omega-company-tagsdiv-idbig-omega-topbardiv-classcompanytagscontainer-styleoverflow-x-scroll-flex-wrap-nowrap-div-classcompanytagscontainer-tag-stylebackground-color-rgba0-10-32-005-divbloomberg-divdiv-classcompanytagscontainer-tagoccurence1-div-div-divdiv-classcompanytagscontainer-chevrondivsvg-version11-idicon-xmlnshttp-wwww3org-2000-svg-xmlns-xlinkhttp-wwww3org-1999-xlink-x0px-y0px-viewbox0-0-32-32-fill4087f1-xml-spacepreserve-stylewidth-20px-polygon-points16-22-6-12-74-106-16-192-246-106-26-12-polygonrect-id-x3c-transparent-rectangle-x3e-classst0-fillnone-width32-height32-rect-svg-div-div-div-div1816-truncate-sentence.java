class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String str1="";
        for(int i=0;i<k;i++){
            if(i==0){
                str1+=arr[i];
            }else{
            str1=str1+" "+arr[i];
            }
        }
        return str1;
    }
}