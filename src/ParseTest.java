/**
 * String s = string_to_parse;
*String delims = "[delimiters]+"; // use + to treat consecutive delims as one;
 *                                // omit to treat consecutive delims separately
*String[] tokens = s.split(delims);
 * 
 * 
 * There are several characters that have a special meaning when they appear inside [ ]. 
 *  The characters are ^  -  [  and two &s in a row(&&). In order to use one of these characters, 
 *  we need to put \\ in front of the character:
 * 
 */

public class ParseTest {

   public static void main(String args[]) {
	   String expr = "2*x^3 - 4/5*y +  z^2";
	   String delims = "[+\\-*/\\^ ]+"; // so the delimiters are:  + - * / ^ space
	   String[] tokens = expr.split(delims);

	   
	   for (int i = 0; i < tokens.length; i++)
		    System.out.println(tokens[i]);
	   
	   
	   
}
}


