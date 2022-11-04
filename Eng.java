/*3. 사용자에게 길이가 5자인 영단어를 입력받아
	모음('a', 'e', 'i', 'o', 'u')의 개수 출력하기*/
	
import java.util.Scanner;

public class Eng {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		
		int length = str.length();
		
		int a = str.length() - str.replace("a", "").length();
		int e = str.length() - str.replace("e", "").length();
		int i = str.length() - str.replace("i", "").length();
		int o = str.length() - str.replace("o", "").length();
		int u = str.length() - str.replace("u", "").length();
		
		
		System.out.println("a의 개수 : " + a + "개");
		System.out.println("e의 개수 : " + e + "개");
		System.out.println("i의 개수 : " + i + "개");
		System.out.println("o의 개수 : " + o + "개");
		System.out.println("u의 개수 : " + u + "개");
	}
		
}
	