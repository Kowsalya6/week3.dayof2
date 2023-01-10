package week3.day2;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(i%2!=0)
			{
				char s = charArray[i];
				char upperCase = Character.toUpperCase(s);
				
				System.out.println(upperCase);
			}
		} 
	}
}
 	 