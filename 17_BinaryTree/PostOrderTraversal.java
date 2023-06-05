public static List < Integer > getPostOrderTraversal(TreeNode root) {
    	ArrayList<Integer> hash = new ArrayList<>();
        postOrder(root,hash);
        return hash;
    }
public static void postOrder(TreeNode root,ArrayList<Integer> hash){
        if(root==null){
            return;
        }
        postOrder(root.left,hash);
        postOrder(root.right,hash);
        hash.add(root.data);
    }
