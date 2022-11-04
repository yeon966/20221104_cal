//word 문자열에 'r' 문자가 포함되어 있다면 true 출력하기
public class Word {
	public static void main(String[] args){
		String word = "Banana";
		System.out.println(word.indexOf('r') >= 0);
		
		System.out.println(word.contains("na"));
		System.out.println("시작 확인 : " + word.startsWith("Ba"));
		System.out.println("끝 확인 : " + word.endsWith("a"));
		
		String replaced = word.replace('a' , 'o'); //word에서 replace기능으로 'a'를 'o'로 변경
		System.out.println("변경된 문자열" + replaced);
		
		//문자열 자르기
		// 1. 시작 index
		// 2. 시작 index, 끝 index
		
		String sub = word.substring(3);
		String sub2 = word.substring(2 , 5);
		
		System.out.println(sub);
		System.out.println(sub2);
		
	}
}