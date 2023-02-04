class Solution {
    List<Integer>l=new ArrayList<>();
    int c=0;
    public TreeNode INOT(TreeNode root){
        if(root==null){
            return null;
        }
        INOT(root.right);
        c=root.val+c;
        root.val=c;
        INOT(root.left);
        return root;
    }
    public TreeNode convertBST(TreeNode root) {
        return INOT(root);
        
    }
}
