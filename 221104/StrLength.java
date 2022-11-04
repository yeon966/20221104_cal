/* 5. 사용자에게 문자열 3개를 입력받아
	길이값의 합을 출력하고, 가장 긴 문자열을 출력하기*/

import java.util.Scanner;

public class StrLength {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 문자열를 입력하세요.");
		String str1 = scan.nextLine();
		System.out.print("두 번째 문자열를 입력하세요.");
		String str2 = scan.nextLine();
		System.out.print("세 번째 문자열를 입력하세요.");
		String str3 = scan.nextLine();
		
		int length1 = str1.length();
		int length2 = str2.length();
		int length3 = str3.length();
		
		int sum = length1 + length2 + length3;
		
		System.out.println("공백을 포함한 문자열들의 길이 합은 : " + sum + "입니다.");
		
			if ((length1 > length2) && (length1 > length3)) {
			System.out.println("길이가 가장 긴 문자열은 " + str1 + "입니다.");
		} else if (length2 > length3) {
			System.out.println("길이가 가장 긴 문자열은 " + str2 + "입니다.");
		} else if (length2 < length3) {
			System.out.println("길이가 가장 긴 문자열은 " + str3 + "입니다.");
		} else {
			System.out.println("길이가 가장 긴 문자열은 " + str1 + "," +  str2 + "," + str3 + "입니다.");
		}
	}	
}	