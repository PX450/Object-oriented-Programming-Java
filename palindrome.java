import java.util.*;
public class pal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int i,f=0;
		char l;
		System.out.println("enter the string");
		str=sc.next();
		System.out.println("enter the letter");
		l=sc.next().charAt(0);
		
		for(i=0;i<str.length();i++) {
			if(l==str.charAt(i)) {
				f=f+1;
			}
		}
		System.out.println("the letter is found "+f);
	}

}
