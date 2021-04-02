package AssignmentSet3;

public class MoveSpecialCharacters {
	
    public static String moveSpecialCharacters(String str){
    	int counter = 0;
    	int pointer = 0;
    	while (counter < str.length()) {
    		if (String.valueOf(str.charAt(pointer)).matches("[^a-zA-Z0-9]")) {
    			str = str.substring(0, pointer) + str.substring(pointer + 1, str.length()) + str.charAt(pointer);
    		} else {
    			pointer++;
    		}
    		counter++;
    	}
        return str;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
