class Solution {
    void IOT(TreeNode root,List<Integer> ans)
    {
        if(root==null)
            return;
        IOT(root.left,ans);
        ans.add(root.val);
        IOT(root.right,ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>ans= new ArrayList<>();
        IOT(root,ans);
        return ans;
    }
}