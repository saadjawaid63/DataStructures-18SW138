class LinkedListEx
{
    private  int size;
	private Node start;
	
	//this is a default constructor if do not create it. there will be no error.
	public LinkedListEx()
	{
		size=0;
		start=null;
	} 
	
	public boolean isEmpty()
	{
		if (start==null) 
		{
			return (true);
		}
		else
			return (false);
	}
	
	public int getSize()
	{
		return (size);
	}
	
	public void viewList()
	{
		Node t=start;
		if (isEmpty()) 
		{
			System.out.println("\nList is Empty!");
		}
		else
		{
			while(t!=null)
			{
				System.out.print(" "+t.getData());
				t=t.getNext();
			}
		}
	}
	public void insertAtFirst(int val)
	{
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		start=n;
		size++;
	}
	public void insertAtLast(int val)
	{
		Node n,t;
		n= new Node();
		n.setData(val);
		t=start;
		if (t==null) 
			start=n;
		else
		{
			while(t.getNext()!=null)
				t=t.getNext();
			t.setNext(n);
		}
		size++;
	}
	public void insertAtPos(int val, int pos)
	{
		if (pos==1) 
		{
			insertAtFirst(val);
		}
		else if (pos==size+1) 
		{
			insertAtLast(val);
		}
		else if(pos>1&&pos<=size)
		{
			Node n,temp;
		    n=new Node(val,null);
		    temp=start;
		    for (int i=1 ;i<pos-1 ;i++ )
		    	temp=temp.getNext();
		    n.setNext(temp.getNext());
		    temp.setNext(n);
		    size++;
		}
		else
			System.out.println("Insert is not possible at: "+pos);
	}
	public void deleteAtFirst()
	{
		if (start==null) 
		{
			System.out.println("List is already null");
		}
		else
		{
			start=start.getNext();
			size--;
		}
	}
	public void deleteAtLast()
	{
		if (start==null) 
		{
			System.out.println("List is already null");
		}
		else if (size==1)
		{
			start=null;
			size--;
		}
		else
		{
			Node n,t;
		    n= new Node();
		    t=start;
		    for (int i=1 ;i<size-1 ; i++ )
		    {
		    	t=t.getNext();
		    }
		    t.setNext(null);
		    size--;
		}
	}
	public void deleteAtPos(int pos)
	{
		if (start==null) 
		{
			System.out.println("List is already null");
		}
		else if(pos<1||pos>size)
		{
			System.out.println("Invalid position.");
		}
		else if (pos==1) 
		{
			deleteAtFirst();
		}
		else if (pos==size) 
		{
			deleteAtLast();
		}
		else
		{
			Node t1,t;
		    t1 = new Node();
		    t=start;
		
		for (int i=1 ; i<pos-1 ;i++ ) 
			{
				t=t.getNext();
			}
		    t1=t.getNext();
			t.setNext(t1.getNext());
			size--;
		}
	}
}