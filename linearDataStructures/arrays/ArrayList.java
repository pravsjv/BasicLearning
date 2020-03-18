public class ArrayList<E> {
	private int size = -1;
	private static final int DEFAULT_SIZE=5;
	private Object[] arr;

	ArrayList() {
		arr = new Object[DEFAULT_SIZE];
	}

	private void ensureCapacity() {
		int newSize = DEFAULT_SIZE*10;
		arr = Arrays.copyOf(arr, newSize);
	}

	public E get(int index) {
		if(index < 0 || size < 0)
			throw new IndexoutOfBoundsException("Invalid index");

		return arr[index];
	}
}