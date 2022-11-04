public class StringEquality2 {
	public static void main(String[] args){
		String origin = "Hello";
		String another = origin;
		
		
		origin += "World";
		
		System.out.println(origin);
		System.out.println(another);
		
		System.out.println(origin == another);
		System.out.println(origin == "HelloWorld");
	}
}