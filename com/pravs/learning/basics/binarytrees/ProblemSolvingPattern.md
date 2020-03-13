Boot Camp:
- Recursive algorithms are best suited to problems on trees.
But the important thing to remember while using recursion is mentioning of "function call stack" while doing space complexity analysis.
- Consider left and right skewed trees when doing complexity analysis.
Note that O(h) translates to O(log n) for balanced trees, but O(n) for skewed trees.
- If each node has parent field, use it to make your code simpler, and to reduce space and time complexity
- Its easy to make the mistake of treating  a node that the single child as a leaf.
