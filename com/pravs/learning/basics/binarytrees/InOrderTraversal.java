public class InOrderTraversal<T> {
  public void recursiveTraversal(TreeNode<T> root) {
		if(root == null)
			return;

		System.out.print(root.getVal()+"  ");
		recursiveTraversal(root.getLeft());
		recursiveTraversal(root.getRight());
	}

  public void iterativeTraversal(TreeNode<T> root) {
		if(root == null)
			return;

		Stack<TreeNode<T>> s = new Stack<>();
		TreeNode<T> tempNode = root;

		while(tempNode != null || !s.isEmpty()) {
			while(tempNode != null) {
				s.push(tempNode);
				tempNode.getLeft();
			}
			tempNode = s.pop();
			System.out.print(tempNode.getVal()+"  ");

			tempNode = tempNode.getRight();
		}
	}
}
