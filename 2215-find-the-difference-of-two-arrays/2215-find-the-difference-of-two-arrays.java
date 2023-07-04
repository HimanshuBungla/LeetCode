class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<Integer>();
        HashSet<Integer> n2 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i ++) {
            n1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i ++) {
            n2.add(nums2[i]);
        }
        
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for (int i : n1) {
            if (!n2.contains(i)) {
                l1.add(i);
            }
        }
        for (int i : n2) {
            if (!n1.contains(i)) {
                l2.add(i);
            }
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
}