// 사용자에게 컵의 사이즈를 출력하는 프로그램

// 용량 200 이상 => large
// 100이상 200미만 => medium
// 100미만 => small
import java.util.Scanner;
public class TestIf5 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("용량?");
		int drink = scan.nextInt();
		
		if (drink >= 200) {
			System.out.println("large");
		} else if (drink < 100){
			System.out.println("small");
		} else {
			System.out.println("medium");
		} 
	}
}	