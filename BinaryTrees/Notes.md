- A tree datastructure that has atmost 2 children/sub trees is called binary tree.
- Why trees?
    - to store the data naturally in hierarchal format
    - Trees like BST provide moderate search
    - Trees provide moderate insertion and deletion
    - Manipulate sorted lists of data
    - multi-stage decision making

- Types of Binary trees
    - Full Binary Tree : If every node in the tree has either 0 or no children. Number of leaf nodes in this tree is "number of internal nodes + 1"
    - Complete Binary Tree : If all the levels of a binary tree are filled except possibly the last level and the last level has nodes as left as possible. Practical example is Binary Heap.
    - Perfect Binary Tree : If all the nodes in a binary tree have two children and all leaves are at the same level. A perfect binary tree has 2^h-1 nodes.

  - Traversals:
    - PreOrder Traversal : root -> left -> right
    - InOrder Traversal : left -> root -> right
    - PostOrder Traversal : left -> right -> root

  - A binary tree is said to be height balanced if for each node in the tree, the difference in the height of left and right sub trees is at most 1.
  - A perfect binary tree is height balanced, as is a complete binary tree.
  - A height balanced tree need not be a perfect tree or a complete tree.


- BFS vs DFS :
  - All the traversals take Time Complexity of O(N) as they need to traverse each element at least once.
  - BFS take an extra space of O(W), where w is the maximum width of the binary tree. Whereas DFS take an extra space of O(H), where H is the height  of the tree.
  - BFS traversal uses Queue data structure and DFS uses stacks for Traversals
  - Extra space in BFS is likely to be more for a balanced tree and extra space in DFS is likely to be more in less balanced trees.
  - DFS traversals are typically recursive, hence there will be an overhead of stack function calls.
  - BFS starts its traversal from the root and DFS starts its traversal from the leaves. So depending on our problem based on which is closer to, we should select the traversal for solving the problem.

  
