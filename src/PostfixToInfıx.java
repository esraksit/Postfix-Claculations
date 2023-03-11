import java.util.Stack;

import java.util.Stack;

public class PostfixToInfýx {
	
	
	public static void main(String[] args) {
	
		
		String expression="ABCD+*+EF/G*-H+";  	
	Stack s1= new Stack();
	String exp1,exp2,result = null;
	
	
	for(int i=0; i<expression.length();i++) {
		
		char c=expression.charAt(i);
		
		 if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			s1.push(Character.toString(c));						
		}
		 else {
			 exp2=(String) s1.pop();
			 exp1=(String)s1.pop();
			
			 switch(c) {
				
				case '+':
					result="("+exp1+"+"+exp2+")";
				
					break;
				case '-':

					result="("+exp1+"-"+exp2+")";
					break;
					
				case '/':
					result="("+exp1+"/"+exp2+")";
					break;
				case '*':
					result="("+exp1+"*"+exp2+")";
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
