
public class BinaryToDecimal{
	
static int convertBinaryToString(String binString){
	Stack s=new ArrayBasedImplementation();	
	
		int res=0;
		int count=0;
		
		for(int i=0; i<binString.length();i++) {
			char c=binString.charAt(i);
			s.push((int)(c-'0'));
		}
		
		
		
		for(int i=0; i<binString.length();i++) {
		
			res=res+(int)s.pop()*((int) Math.pow(2, count));
			count++;			
		}
		
		System.out.println(res);
		
	return res;	
	}
	

public static void main(String[] args) {
	
	String binString="1001101";
	convertBinaryToString(binString);
	
}
	
	
}
	
	
	
