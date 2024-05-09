class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max_candies = 0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max_candies){
                max_candies = candies[i];
            }
        }
        
        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max_candies){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        
        return list;
    }
}