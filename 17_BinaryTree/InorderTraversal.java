public static List < Integer > getInOrderTraversal(TreeNode root) {
        ArrayList<Integer> hash = new ArrayList<>();
        inOrder(root,hash);
        return hash;
    }
    public static void inOrder(TreeNode root,ArrayList<Integer> hash){
        if(root==null){
            return;
        }
        inOrder(root.left,hash);
        hash.add(root.data);
        inOrder(root.right,hash);
    }
