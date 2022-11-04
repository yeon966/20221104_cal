public class StringTest3 {
	public static void main(String[] args){
			String test = "TEST";
			
			String lower = test.toLowerCase();
			System.out.println(lower);
			
			String upper = lower.toUpperCase();
			System.out.println(upper);
			
			System.out.println("원래값 : " + test);
			
			System.out.println(upper == test);
	}
}