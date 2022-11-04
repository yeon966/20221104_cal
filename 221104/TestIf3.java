// 사용자에게 정수 2개를 입력받아
// (큰수 - 작은 수)를 출력하기

import java.util.Scanner;
public class TestIf3 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 2개를 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result;
		
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		System.out.println("큰 수에서 작은 수를 뺀 값 : " + result);
	}
}