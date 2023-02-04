class Solution {
    List<Integer>l=new ArrayList<>();
    public List<Integer> INOT(TreeNode root){
        if(root==null){
            return l;
        }
        INOT(root.left);
        l.add(root.val);
        INOT(root.right);
        return l;
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer>m=INOT(root);
        int c=m.get(m.size()-1);
        for(int i=0;i<m.size()-1;i++){
            c=Math.min(c,Math.abs(l.get(i)-l.get(i+1)));
        }
        return c;
    }
}
