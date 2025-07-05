class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int lucky_int = -1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == entry.getKey()){
                if(entry.getKey() > lucky_int){
                    lucky_int = entry.getKey();
                }
            }
        }

        return lucky_int;
    }
}