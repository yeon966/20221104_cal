/*3. 사용자에게 길이가 5자인 영단어를 입력받아
	모음('a', 'e', 'i', 'o', 'u')의 개수 출력하기*/
	
import java.util.Scanner;

public class Eng {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(str);
		
		char eng1 = str.charAt(0);
		char eng2 = str.charAt(1);
		char eng3 = str.charAt(2);
		char eng4 = str.charAt(3);
		char eng5 = str.charAt(4);
		
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		
		
		if (str.equals('a')) {
			++a;
		}
		
		
		
		
		System.out.println(a);
		}
	}	