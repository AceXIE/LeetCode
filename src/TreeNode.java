
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int x) {
		val = x;
	}
	
	public static void print(TreeNode root) {
		if (root != null) {
			print(root.left);
			System.out.print(root.val + ",");
			print(root.right);
		}
	}
	
}
