class Solution {
      public TreeNode construct(int[]nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode node=new TreeNode(nums[mid]);
        if(left==right){
            return node;
        }
        node.left=construct(nums,left,mid-1);
        node.right=construct(nums,mid+1,right);
        return node;
    }
    public TreeNode sort(int[] nums) {
        TreeNode root11=construct(nums,0,nums.length-1);
        return root11;
    }
    ArrayList<Integer>l=new ArrayList<>();
    public ArrayList<Integer> INOT(TreeNode root){
        if(root==null){
            return l;
        }
        INOT(root.left);
        l.add(root.val);
        INOT(root.right);
        return l;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>m=INOT(root);
        int[]arr=new int[m.size()];
        int o=0;
        for(Integer i: m){
            arr[o]=i;
            o++;
        }
        return sort(arr);
        
    }
}
