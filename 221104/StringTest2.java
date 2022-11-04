public class StringTest2 {
	public static void main(String[] args){
		String hello = "Hello";
		
		int length = hello.length();
		
		System.out.println(length);
		
		char first = hello.charAt(0);
		System.out.println(first);
		
		char last = hello.charAt(4);
		System.out.println(last);
	}
}