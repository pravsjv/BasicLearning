Arrays are linear data structures that store elements in contiguos memory locations.
- as the elements are stored in contiguous memory locations they can be accessed simply via index which is of TC O(1)
- Insertion at the end of the array is O(1) if the array has enough memory. Else there will be an overhead of copying all the array elements to a new array of bigger size. Also adding an element at the start or middle has an overhead of copying the elements and TC of O(n)
- Like Insertion, deleting an element at the last of the array is O(1), but deleting in any other part of the array is O(N) with a overhead of moving elements.
- So arrays are best suited for accessing the elements than insertion and deletion.
- poulalry suited for caching the elements 

Disadvantages :
	- Limit in size, but dynamic arrays like Array List can be used with an overhead of copying elements when size is reached.
	- slow insertion and deletion operations

Advantages :
	- faster element access with the index known
	- easy, simple and most popularly used

Problem Solving BootCamp:
	- Most of the array problems have a brute-force solution that uses O(n) space, but subtler solutions that use array itself to reduce the space complexity to O(1)
	- Filling an array from the front is very Slow, hence try to fill it from back.
	- Instead of deleting an entry, consider overwriting it
	- When dealing with integers encoded by an array, consider processing the digits from the back. Alternately reverse the array so the least-significant digit is the first entry.
	- Be comfortable writing code on operating sub arrays.
	- It's incredibly easy make Off-by-1 errors when operating on arrays.
	- Don't worry about preserving the integrity of the array untill you return the result.
	- Array serves a best data structure when it's distribution is known 
	- When operting on 2-D arrays, use parallel logic
	- Sometimes it's easier to simulate the specification than to analytically solve for the result.


Problem Solving Patterns on Arrays:
	- Sliding Window Pattern
	- Two pointers or Iterators
	- Fast and slow pointers(mostly used to find the cycles in arrays or linkedlists)
	- Merge Intervals
	- Cyclic Sort

Arrays in Java:
	- Arrays class is present in java.util package
	- Arrays are treated as objects in java
	- Every array type implements the interfaces Cloneable and Serializable
	- Direct super class of an array is Object itself.

Most Used Methods for Arrays in Java:
	- arr.length - returns the length of the array.
	- Arrays.copyOf(Original, newSize) - copies all the elements in an array to a new Array of different size usually larger ones
	- Arrays.copyOfRange(originalArray, fromindex, endIndex) - copies the elements from an original array to a new one from a given rangeof indices
	- Arrays.sort() - sorts the elements
	- Arrays.binarySearch(arr[], fromIndex, toIndex, key, comparator) - searches an element using binary search
	- Arrays.compare(arr1, arr2) - compares the arrays lexicographically


