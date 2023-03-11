
public class StackStore {

private	String infix ;
private	String postfix ;

public void getInfix(String infix) {
	this.infix=infix;
}
public void showInfix(String infix) {
System.out.print(infix);	
}
public void showPostfix(String postfix) {
	System.out.print(postfix);
}
public static String convertToPostfix(String postfix) {
	return postfix;
}
public static boolean oncelýk(char c1) {

	if(c1=='*'||c1=='/') {
		return true;
	}
	else  {
		return false;
	}
}
}
