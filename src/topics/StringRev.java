package topics;

public class StringRev {
	
	public static void main(String[] args) {
		
		String a="Hari";
		String b="karan";
		String c = "malayalam";
		String rev = "";
		
		a=a+b;
		//Addtiton of two Strings
		System.out.println(a);
		
		b = a.substring(0,a.length()-b.length());
		System.out.println(b);
		
		a=a.substring(a.length()-b.length()-1);
		System.out.println(a);
		
		for (int i = c.length()-1; i >= 0; i--) {
			
			rev = rev+c.charAt(i);
			
		}
		
		if(rev.equals(c)) {
			System.out.println("The String "+  c   + " is Pallindrome");
		}
		
	}

}
