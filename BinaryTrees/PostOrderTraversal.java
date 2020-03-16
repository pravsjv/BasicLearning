public class PostOrderTraversal<T> {
	public void recursiveTraversal(TreeNode<T> root) {
		if(root == null)
			return;

		recursiveTraversal(root.getLeft());
		recursiveTraversal(root.getRight());
		System.out.print(root.getVal()+"  ");
	}
}
