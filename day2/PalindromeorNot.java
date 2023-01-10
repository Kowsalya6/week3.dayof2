package week3.day2;

public class PalindromeorNot {

	public static void main(String[] args) {
		String string = "madam";
		String rev= "";
		char[] charArray = string.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			rev=rev+ string.charAt(i);	
			
		}
		if(rev.equals(string))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}

	} 

}
