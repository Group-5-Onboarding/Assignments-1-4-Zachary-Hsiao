package AssignmentSet3;

public class Palindrome {
    public static boolean checkPalindrome(String str){
	    String result = "";
	    for (int i = str.length() - 1; i >= 0; i--) {
	    	result += str.charAt(i);
	    }
        return str.contentEquals(result);
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
