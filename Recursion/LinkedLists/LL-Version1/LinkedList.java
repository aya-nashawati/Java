
public class LinkedList 
{
	//make sure head is pointing to the very first node --> don't lose your head
	private Node head;
	
	//OPTIMIZATION
	//add a pointer to the end of the list
	//when head points to 1, tail will point to 2, etc
	private Node tail;
	
	//accepts a value/number
	public void add(int v)
	{
		//choose to pass a value
		/*
		 * Node n = new Node(v);
		 * head = n;
		*/
		if (head == null)
		{
			head = new Node(v);
			tail = head;
		}
		else
		{
			//set a temp variable pointing to head
			//since we added tail we NO LONGER NEED TO LOOP
			/*
			 * Node n = head;
			 * while(n.next != null)
			 * {
			 * n = n.next;
			 * }
			 * n.next = new Node(v);
			*/
			
			//-------------------------------------------------------------------
			//method 1
			//create a new Node 
			//tail.next --> what used to be null is now pointing to a new Node
			tail.next = new Node(v);
			tail = tail.next;
			//-------------------------------------------------------------------
			
			//-------------------------------------------------------------------
			//method 2 --> this doesn't work always, since head is only one node
			/*
			 * tail = new Node(v);
			 * head.next = tail;
			 */
			//-------------------------------------------------------------------
		}	
	}
	
	public void print()
	{
		//don't lose your head --> we shouldn't be using head now
		Node n = head;
		
		while(n!=null)
		{
			System.out.println(n.value);
			n = n.next;
		}
	}
	
	
}

//=========================================================================//
//QUESTION --> why would we create a LinkedList instead of an ArrayList
// - LinkedList is better for adding and deleting
// - prevents shifting
// - an ArrayList is better for accessing a specific element
//=========================================================================//
