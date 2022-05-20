package topics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pattern {

	public static void main(String[] args) {

		String a = "automationtester";
		String Output = "";
		int t=0;

		for (int i = 0; i < a.length() - 1; i++) {

			char c = a.charAt(i);
			if (Output.indexOf(c) == -1) {
				Output = Output + c;
			}
		}
		// System.out.println(Output);

		int len = a.length();
		char[] arr = new char[len];
		//
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = a.charAt(i);
		// }
		// System.out.println(arr);
		
		
		Set <Character> s = new LinkedHashSet<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			s.add(c);
		}
		
		for (Character s1 : s) {
			System.out.print(s1);
		}

		

	}

}
