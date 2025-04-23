class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max_size = 0;
        for(int i=1;i<=n;i++){
            int digit_sum = 0;
            int temp = i;
            while(temp>0){
                digit_sum += (temp%10);
                temp = temp/10;
            }
            map.put(digit_sum,map.getOrDefault(digit_sum,0)+1);
            max_size = Math.max(max_size,map.get(digit_sum));
        }
        int count = 0;
        for (int val : map.values()) {
            if (val == max_size) count++;
        }
        return count;
    }
}