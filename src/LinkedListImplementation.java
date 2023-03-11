

public class LinkedListImplementation implements Stack{

	private Node head=null;
	private int size;
	int topCount=0;//size gibi
	private Node top=null;
	
	
	@Override
	public boolean isEmpty() {		
		if (topCount==0) {return true;}
		else {return false;}		
	}

	@Override
	public boolean isFull() {
		if(topCount==this.size) {			
			return true;
		}
		else{
			return false;	
		}
	}
	

	@Override
	public void push(Object itm) {
	
	int i = (Integer) itm;
	Node nw = new Node(i);
	Node walk=head;
	
	
	if (isEmpty()) {
		head=nw;
		top=nw;
		topCount++;
	}
	
	else {
		
		while(walk.next!=null) {
			walk=walk.next;
			}
		walk.next=nw;
		top=nw;
		topCount++;
		
	}
	}

	@Override
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return null;
		}
		else
		{
			Node walk =head;
			while(walk.next!=top) {
				walk=walk.next;
			}
			Object pop=top;
			top=walk;
			walk.next=null;
			topCount--;
		return pop;
		}
	
		
	}

	@Override
	public Object peek() {
		
		if(isEmpty()) {
			return null;
		}
		else {
			System.out.print(top);
			return top;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Stack<Integer> s1=new LinkedListImplementation();
	//s1.push(4);
//	s1.push(5);
//	s1.pop();
//	s1.peek();
	}

}
