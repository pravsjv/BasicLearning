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