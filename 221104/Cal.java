/*2. 계산기 만들기
	사용자에게
	정수1
	정수2
	연산자(+, -, *, /) 중 하나를 입력 받아
	결과를 출력하기*/
import java.util.Scanner;

public class Cal {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String cal;
		
		System.out.print("첫 번째 정수를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요.");
		int num2 = scan.nextInt();
		System.out.print("다음 연산자 중 하나를 입력하세요. (+, -, *, /)");
		cal = scan.next();
		
		if (cal.equals("+")) {
			System.out.println(num1 + num2);
		} else if (cal.equals("-")) {
			System.out.println(num1 - num2);
		} else if (cal.equals("*")) {
			System.out.println(num1 * num2);
		} else if (cal.equals("/")) {
			System.out.println((double)num1 / num2);
		} else {
			System.out.println("올바른 값을 입력하세요.");
		}
	}
}	