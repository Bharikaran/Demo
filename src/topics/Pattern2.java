package topics;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		String a = "selenieum";
		String out="";
		int ecount =0;
		
//		for (int i = 0; i < a.length(); i++) {
//			
//			if(a.charAt(i)=='e') {
//				out=out+'*';
//			}
//			else {
//				out=out+a.charAt(i);
//			}
//		}
//		System.out.println(out);
		
		
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if(c=='e') {
				ecount++;
				for (int j = 0; j < ecount; j++) {
					out = out + '*';
				}
			}
			else {
				out = out + c;
			}
		}
		System.out.println(out);
	}

}
