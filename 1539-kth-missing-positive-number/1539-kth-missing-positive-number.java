class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> missingele = new ArrayList<Integer>();
        int ele = 0;
        for (int i = 1; i < arr[arr.length - 1]; i++) {
            if (arr[ele] == i)
                ele++;
            else
                missingele.add(i);
        }
        if (missingele.size() >= k)
            return missingele.get(k - 1);
        else
            return arr[arr.length - 1] + k - missingele.size();
    }
}