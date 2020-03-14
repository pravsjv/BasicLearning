public class MergeTwoBinaryTrees {
	public TreeNode<Integer> mergeTrees(TreeNode<Integer> tree1, TreeNode<Integer> tree2) {
		if(tree1 == null)
			return tree2;

		if(tree2 == null)
			return tree1;

		tree1.setVal(tree1.getVal()+tree2.getVal());
		mergeTrees(tree1.getLeft(), tree2.getLeft());
		mergeTrees(tree1.getRight(), tree2.getRight());

		return tree1;
	}
}
