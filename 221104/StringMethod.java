public class StringMethod {
	public static void main(String[] args){
		String word = "Banana";
		
		int length = word.length(); // 길이값 (총 문자 개수)
		
		char last = word.charAt(length - 1); // 인덱스로 문자
		
		int index = word.indexOf('B'); // 해당 문자의 index
		System.out.println("B의 인덱스 : " + index);
		System.out.println(word.indexOf('C'));
		
		System.out.println(length);
		System.out.println(last);
	}
}