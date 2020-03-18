public class BasicOperations<E> {
	private int size = -1;
	private static final int DEFAULT_CAPACITY = 10;
	private Object[] arr;

	BasicOperations(int capacity) {
		arr = new Object[capacity];
	}

	BasicOpearions() {
		arr = new Object[DEFAULT_CAPACITY];
	}

	public void add(E element) {
		if(size >= arr.length)
			throw new IndexOutOfBoundsException("Size of the array limit has reached");

		arr[size++] = element;
	}

	public E get(int index) {
		if(index >= size || index<0)
			throw new IndexOutOfBoundsException("Invalid Index");

		return (E)arr[index];
	}

	public void addAt(int index, E element) {
		if(size >= arr.length)
			throw new IndexOutOfBoundsException("Size of the array limit has reached");
		int i =0;
		for(i=size; i>k; i--)
			arr[i] = arr[i-1];

		arr[i] = element;
		size++;
	}

	public void printArray() {
		for(int i=0; i<size; i++)
			System.out.print(arr[i]+"  ");
	}

	public void remove() {
		if(size <= 0)
			throw new IndexOutOfBoundsException("array is empty");

		--size;
	}

	public void removeAt(int index) {
		if(index <0 || size < 0)
			throw new IndexOutOfBoundsException("Invalod index");

		for(int i=index; i<size-1; i++) {
			arr[i] = arr[i+1];
		}
		size--;
	}

	public static void main(String[] args) {
		BasicOperations<Integer> obj = new BasicOperations();

		obj.
	}
}