class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> sol = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++)
        {
            List<Integer> curr = new ArrayList<Integer>();
            for(int j = 0; j < i+1 ; j++)
            {
                if(j == 0 || j == i)
                {
                    curr.add(1);
                }else
                {
                    curr.add(sol.get(i-1).get(j-1)+sol.get(i-1).get(j));    
                }  
            }
            sol.add(curr);
        }
        return sol;
    }
}