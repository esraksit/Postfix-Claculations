import java.util.Stack;

public class PostfixCalculator {
	public static void main(String[] args) {
	
	String expression="54*32+-";   //7+2-6=3 olmalý
		
	Stack s1= new Stack();
	int num1,num2;
	int result=0;
	
	for(int i=0; i<expression.length();i++) {
		
		char c=expression.charAt(i);
		
		if(c>='0' && c<='9') {
			s1.push((int)(c-'0'));
			
			
		}
		 else {
			 num2=(int) s1.pop();
			 num1=(int) s1.pop();
			
			 switch(c) {
				
				case '+':
					result=num1+num2;
				
					break;
				case '-':
					result=num1-num2;
					break;
					
				case '/':
					result=num1/num2;
					break;
				case '*':
					result=num1*num2;
					break;
					
				default:	
					break;
				}	
			 s1.push(result);
		 }
		
	}

	
	System.out.print(s1.pop());	
											}			
}
