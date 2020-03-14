public class BinaryTree<T> {
	private TreeNode<T> root;

	public static void main(String[] args) {
		BinaryTree<String> bt = new BinaryTree<>();

		bt.root = new TreeNode<String>("ChinnaBabu");
		bt.root.setLeft(new TreeNode<String>("Rajani"));
		bt.root.setRight(new TreeNode<String>("Praveen"));
		bt.root.getLeft().setLeft(new TreeNode<String>("Honey"));
		bt.root.getLeft().setRight(new TreeNode<String>("Shreyansh"));
		bt.root.getRight().setLeft(new TreeNode<String>("Advika"));

		InOrderTraversal<String> io = new InOrderTraversal<>();
		System.out.print("InOrderTraversal using Recursive Function: ");
		io.recursiveTraversal(bt.root);
		System.out.println();
		PreOrderTraversal<String> po = new PreOrderTraversal<>();
		System.out.print("PreOrderTraversal using Recursive Function: ");
		po.recursiveTraversal(bt.root);
		System.out.println();
		PostOrderTraversal<String> pot = new PostOrderTraversal<>();
		System.out.print("PostOrderTraversal using Recursive Function: ");
		pot.recursiveTraversal(bt.root);

		//PreOrder Iterative Traversal
		System.out.println();
		System.out.print("InOrderTraversal using Iterative Function: ");
		io.recursiveTraversal(bt.root);

		//PreOrder Iterative Traversal
		System.out.println();
		System.out.print("PreOrderTraversal using Iterative Function: ");
		po.recursiveTraversal(bt.root);
	}
}
