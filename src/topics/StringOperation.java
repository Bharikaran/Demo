package topics;

public class StringOperation {
	

	public static void main(String[] args) {
		
		String a = "Harikaran1995@gmail.com";
		int s=0,cap=0,sp=0,n=0;
		String Cap="",small="",Special="",num="";
		
		for (int i = 0; i < a.length(); i++) {
			
			char c= a.charAt(i);
			
			if(c>=65&&c<=90) {
				cap++;
				Cap=Cap+c;
			}
			
			else if(c>=97&&c<=122) {
				s++;
				small=small+c;
			}
			
			else if(c>='0'&&c<='9'){
				n++;
				num=num+c;
			}
			
			else {
				sp++;
				Special = Special+c;
			}
			
		}
		
		System.out.println("Capital letters are ===> "+Cap+" and the count is "+cap);
		System.out.println("Small letters are ===> "+small+" and the count is "+s);
		System.out.println("The numbers are ==> "+num+" and the count is "+n);
		System.out.println("The Special characters are ==> "+Special+" and the count is "+sp);
		
	}
	
	

}
