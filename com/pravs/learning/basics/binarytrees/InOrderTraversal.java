public class InOrderTraversal<T> {
  public void recursiveTraversal(TreeNode<T> root) {
		if(root == null)
			return;

		System.out.print(root.getVal()+"  ");
		recursiveTraversal(root.getLeft());
		recursiveTraversal(root.getRight());
	}
}
