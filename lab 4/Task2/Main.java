import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		LinkedListEx list = new LinkedListEx();
		Scanner input = new Scanner(System.in);
		boolean flage=true;
		while(flage!=false)
		{
			System.out.println("\n1. Add item at start.");
	    	System.out.println("2. Add item at last.");
		    System.out.println("3. Add item at specific position.");
      		System.out.println("4. Delete first item.");
		    System.out.println("5. Delete last item.");
		    System.out.println("6. Delete at specific position.");
		    System.out.println("7. View items list.");
		    System.out.println("8. Exit.");
		    System.out.print("Enter your choice: ");
		    int choice = input.nextInt();
		    int position;
		    int val;
		    switch(choice)
		    {
		    	case 1:
		    	    System.out.print("Enter value to be inserted: ");
		    	    val = input.nextInt();
		    	    list.insertAtFirst(val);
		    	    break;

		    	case 2:
		    	    System.out.print("Enter value to be inserted: ");
		    	    val = input.nextInt();
		    	    list.insertAtLast(val);
		    	    break;
		    	case 3:
		    	    System.out.print("\nEnter postion: ");
		    	    position=input.nextInt();
		    	    System.out.print("Enter value to be inserted: ");
		    	    val = input.nextInt();
		    	    list.insertAtPos(val,position);
		    	    break;
		    	case 4:
		    	    list.deleteAtFirst();
		    	    break;
		    	
		    	case 5:
		    	    list.deleteAtLast();
		    	    break;
		    	
		    	case 6:
		    	    System.out.print("\nEnter position: ");
                    position = input.nextInt();
                    list.deleteAtPos(position);
                    break;
		    	
		    	case 7:
		    	    list.viewList();
		    	    break;
		    	
		    	case 8:
		    	    flage=false;
		    	    break;
		    	
		    	default:
		    	    throw new InputMismatchException("Invalid entry");
		    }
		}
	}
}