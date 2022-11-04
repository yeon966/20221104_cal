// 사용자에게 시험 점수를 입력받아
// 합격 불합격을 출력합니다.
// 불합격 시에는 모자란 점수와 함께 출력.

import java.util.Scanner;
public class TestIf4 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험 점수를 입력해주세요.");
		int score = scan.nextInt();
		
		if (score >= 60) {
			System.out.println("축하합니다! 합격입니다.");
		} else {
			System.out.println(60 - score + "점 차이로 불합격입니다.");
			
		}
	}
}	