package session4.assignment4;

public class ReverseString {

	public static void main(String[] args) {
		String s = "SCHIZOPHRENIA";
		System.out.println("String is "+s);
		StringBuilder sb = new StringBuilder(s);
		sb.reverse(); 
		
		System.out.println("Reverse of string "+s+" is "+sb);

	}

}
