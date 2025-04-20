class Solution {
    public int numRabbits(int[] answers) {
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i:answers){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans = 0;
        for(int x:map.keySet()){
            int group_size = x+1;
            int number_of_group = (map.get(x)+x) / group_size;
            ans = ans + (number_of_group*group_size);
        }
        return ans;
    }
}