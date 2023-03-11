import java.util.Stack;

public class InfixToPost {
	
public static boolean oncelýk(char c1, char c2) {
	
	if(c1=='*'||c2=='/') {
		return true;
	}
	else if(c1=='+'||c2=='-') {
		return true;
	}
	else {
		return false;
	}
}
	public static void main(String[] args) {
		
		
		StackStore store = new StackStore();
		String infix="A+B*(C+D)-E/F*G+H";  
		String postfix="";
		Stack s1= new Stack();
		
		
		for(int i=0; i<infix.length();i++) {
			char c=infix.charAt(i);
			
			if(Character.isAlphabetic(c)) {
			postfix=postfix+c;	
			
				
			}
			
			else if(c=='/'  ||  c=='*' ||  c=='+'  ||  c=='-') {
				while(!s1.isEmpty()&& ((Character) s1.peek() != '(')) {
					if(oncelýk((Character) s1.peek(),c)) {
						
							postfix=postfix+s1.peek();
						
						
						s1.pop();
					}
					else break;
				}
				s1.push(c);
				
			}
			
			
			else if(c== '(') {
				s1.push(c);
			}
			else if(c== ')') {
				while(!s1.isEmpty()) {
					if((Character) s1.peek()==')') {
						s1.pop();
						break;
					}
					if((Character) s1.peek() != '(') {
						postfix=postfix+s1.peek();
					}
					s1.pop();
					
				}
			}
			
				
			
			
		}
		while(!s1.isEmpty()) {
			postfix=postfix+s1.peek();
			s1.pop();
		}
		System.out.print(postfix);
		StackStore ss=new StackStore();
		ss.getInfix(infix);
	}

}
