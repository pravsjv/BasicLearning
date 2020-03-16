public class SymmetricBinaryTree<T> {
	/**
	 * A tree is said to be symmetric if all the left most nodes and rightmost nodes are equal in value
	 * and as well both the nodes should exist except root
	 */
	public boolean isSymmetric(TreeNode<T> lSubTree, TreeNode<T> rSubTree) {

		if(lSubTree == null && rSubTree == null)
			return true;
		else if(lSubTree != null && rSubTree != null) {
			return ((lSubTree.getVal() == rSubTree.getVal())
					&& isSymmetric(lSubTree.getLeft(),rSubTree.getRight())
					&& isSymmetric(rSubTree.getRight(),lSubTree.getLeft()));
		}

		// returning the false in case if any of left or right subtree is empty.
		return false;
	}
}
