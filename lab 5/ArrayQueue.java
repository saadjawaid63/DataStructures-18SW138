interface Queue {
	void add(Object obj);
	Object remove();
	Object peek();
	Object first();
	int size();
}
class ArrayQueue implements Queue {
	Object []a;
	int size;
	public ArrayQueue(int capacity) {
		a=new Object[capacity];
	}
	public void add(Object element) {
		if(size==a.length) {
			resize();
		}
		a[size++]=element;
	}
	public Object peek() {
		return a[size-1];
	}
	public Object first() {
		return a[0];
	}
	public Object remove() {
		Object obj=a[--size];
		--size;
		obj=a[0];
		System.arraycopy(a,1,a,0,size);
		return obj;
	}
	public String toString() {
		String temp="[";
		for (int i=0;i<size;i++) {
			if (i==size-1) {
				temp+=a[i];
			}
			else
				temp+=a[i]+",";
		}
		temp+="]";
		return temp;
	}
	public int size() {
		return size;
	}
	public void resize() {
		assert size==a.length;
		Object arr[]=new  Object[2*a.length];
		System.arraycopy(a,0,arr,0,size);
		a=arr;
	}
	public static void main(String[] args) {
		ArrayQueue eg=new ArrayQueue(5);
		eg.add(3);
		eg.add(5);
		eg.add(7);
		System.out.println(eg.toString());
		System.out.println("Peek of the Queue: "+eg.peek());
		System.out.println("First element of Queue: "+eg.first());
		System.out.println("remove(): "+eg.remove());
	}
}