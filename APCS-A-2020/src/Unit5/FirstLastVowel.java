package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   	String first = a.substring(0, 1);
	   	String last = a.substring(a.length() - 1, a.length());
		String v = "aeiouAEIOU";
		if (v.contains(first) || v.contains(last)) {
			return "yes";
		}
		else {
			return "no";
		}
		
	}
}