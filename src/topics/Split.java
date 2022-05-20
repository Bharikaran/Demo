package topics;

public class Split {
	
	
	public static void main(String[] args) {
		
//		String a = "I am an automation tester";
//		//int l = a.length();
//		//char [] c = new char[l];
//		String [] ch = a.split(" ");
//		int len = ch.length;
//		
//		System.out.println("The number of words in String is "+len+" and the words are ");
//		for (int i = 0; i < ch.length; i++) {
//			System.out.println(ch[i]);
//		}
		
		String v = "Harikaran";
		char [] c = v.toCharArray();
		int vcount=0;
		for (int i = 0; i < c.length; i++) {
			char b = c[i];
			if (b =='a' || b =='e' ||b =='i' ||b =='o' ||b =='u') {
				vcount++;
				
			}
		}
		System.out.println(vcount);
	}

}
