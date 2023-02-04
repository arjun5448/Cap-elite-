class Solution {
    static ListNode c;
    public static TreeNode construct(int l,int r){
        if(l>r){
            return null;
        }
        }
        int mid=(l+r)/2;
        TreeNode Node=new TreeNode();
        Node.left=construct(l,mid-1);
        Node.val=c.val;
        c=c.next;
        Node.right=construct(mid+1,r);
        return Node;
    }
    public TreeNode sortedListToBST(ListNode head) {
        c=head;
        int count=0;
        while(c!=null){
            c=c.next;
            count++;
        }
        c=head;
        return construct(1,count);
}
}
