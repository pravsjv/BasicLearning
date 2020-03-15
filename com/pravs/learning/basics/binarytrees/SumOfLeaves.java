public class SumOfLeaves {
	public int leavesSum(TreeNode<Integer> root) {

		int sum = 0;
		if(root == null)
			return sum;

		if(root.getLeft() == null && root.getRight() == null)
			sum += root.getVal();

		leavesSum(root.getLeft());
		leavesSum(root.getRight());

		return sum;
	}
}
