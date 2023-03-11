
public class ArrayBasedImplementation implements Stack{
	
	
	static final int size = 10;
	int arr[] = new int[size];
	int top=-1;
	
	
	@Override
	public boolean isEmpty() {
		
		if(top<0) {
			
		return true;
		}
		
		else {
			return false;
		}
		
	}

		
	@Override
	public boolean isFull() {
		if(top == size-1) {
		
			 return true;
		}		     
		   else {			   
			   return false;
		   }
		     
	}

	@Override
	public void push(Object itm) {
	if(isFull()) {
		System.out.println("Stack is full.");
	}
	else {
		top++;
		arr[top]=(int) itm;
		
		
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
		int pop =arr[top];	
		top--;
		return pop;
		}
	
	}

	@Override
	public Object peek() {
		System.out.print(arr[top]);
		return arr[top];
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new ArrayBasedImplementation();
		s.push(4);
		s.push(5);
		s.peek();//deneme
	}
}
