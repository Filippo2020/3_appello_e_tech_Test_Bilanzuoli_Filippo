package Stringhe;

public class Stringhe {
	
	public static String stringProperties(String str) {
	    if (str == null) {
	        return "String is null";
	    } else if (str.isEmpty()) {
	        return "String is empty";
	    } else if (str.length() < 5) {
	        return "String length is less than 5";
	    } else if (str.matches("[0-9]+")) {
	        return "String contains only numbers";
	    } else if (str.matches("[a-zA-Z]+")) {
	        return "String contains only letters";
	    } else if (str.matches("[a-zA-Z0-9]+")) {
	        return "String contains only letters and numbers";
	    } else {
	        return "String contains special characters";
	    }
	}
}



