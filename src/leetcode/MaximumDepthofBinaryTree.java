package leetcode;

public class MaximumDepthofBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		System.out.print(maxDepth(root));
	}
	public static int maxDepth(TreeNode root) {
		int ans = 0;
		ans = helper(root);
		return ans;
	}
	public static int helper(TreeNode root) {
		if (root == null) return 0;
		int left = helper(root.left);
		int right = helper(root.right);
		
		return Math.max(left, right) + 1;
	}
}
