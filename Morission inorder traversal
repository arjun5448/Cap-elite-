class Solution {
   List<Integer>l=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return l;
        }
        Stack<TreeNode>stack=new Stack<>();
             TreeNode cur=root;
        while(cur!=null||!stack.isEmpty()){
            while(cur!= null){
                stack.push(cur);
                System.out.println(cur.val);
                cur=cur.left;
            }
            cur=stack.pop();
            l.add(cur.val);
            cur=cur.right;
        }
        return l;
    }
}
