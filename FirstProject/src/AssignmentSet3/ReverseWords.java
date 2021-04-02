package AssignmentSet3;

public class ReverseWords {
    public static String reverseEachWord(String str){
    	String words[] = str.split(" ");
    	String result = "";
    	for (int i = 0; i < words.length; i++) {
    		for (int j = words[i].length() - 1; j >= 0; j--) {
    			result += words[i].charAt(j);
    		}
    		result += " ";
    	}
        return result.substring(0, result.length() - 1);
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
