public class StringEquality {
	public static void main(String[] args){
	String abc = "ABC";
	String another = new String("ABC");
	String refAbc = abc;
	
	// System.out.println(abc == another);
	// System.out.println(abc == refAbc);
	
	System.out.println(abc.equals(another));
	System.out.println(abc.equals(refAbc));
	
	String str = "My String";
	String yourString = str;
	
	System.out.println(yourString);
	
	}
}