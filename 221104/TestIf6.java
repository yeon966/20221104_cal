// 사용자에게 점수를 입력받아
// 90점이상 A
// 80이상 ~ 90점 미만 B
// 70이상 ~ 80점 미만 C
// 70점 미만 D
import java.util.Scanner;

public class TestIf6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("시험 점수 입력 :");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}	