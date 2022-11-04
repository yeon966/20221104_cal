/*4. 사용자에게 3개의 정수를 입력받아
	가장 큰 정수를 출력하기*/

import java.util.Scanner;

public class ThreeInt {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요.");
		int i1 = scan.nextInt();
		System.out.print("두 번째 정수를 입력하세요.");
		int i2 = scan.nextInt();
		System.out.print("세 번째 정수를 입력하세요.");
		int i3 = scan.nextInt();
		
		if ((i1 > i2) && (i1 > i3)) {
			System.out.println("가장 큰 정수는 " + i1);
		} else if (i2 > i3) {
			System.out.println("가장 큰 정수는 " + i2);
		} else {
			System.out.println("가장 큰 정수는 " + i3);
		}
	}
}	