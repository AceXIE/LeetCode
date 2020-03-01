package leetcode;

public class InvertBinaryTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);
		invertTree(root);
		
		TreeNode.print(root);
		
	}
    public static TreeNode invertTree(TreeNode root) {
		if (root == null) return null;
		TreeNode leftNode = invertTree(root.left);
		TreeNode rightNode = invertTree(root.right);
		
		root.left = rightNode;
		root.right = leftNode;
    	
    	return root;
        
    }
}
