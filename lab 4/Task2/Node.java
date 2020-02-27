class Node
{
	private int data;
	private Node next;

    //this is a default constructor if do not create it. there will be no error.
  	public Node()
	{
		data=0;
		next=null;
	}
	public Node(int d, Node n)
	{
		data=d;
		next=n;
	}
	public void setData(int d)
	{
		data=d;
	}
	public int getData()
	{
		return (data);
	}
	public void setNext(Node n)
	{
		next=n;
	}
	public Node getNext()
	{
		return (next);
	}
}
