public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> hash = new ArrayList<>();
        preOrder(root,hash);
        return hash;
}
public void preOrder(TreeNode root,ArrayList<Integer> hash){
        if(root==null){
            return;
        }hash.add(root.val);
        preOrder(root.left,hash);
        
        preOrder(root.right,hash);
}
