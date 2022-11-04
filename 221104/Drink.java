//1. 음료 자판기 (메뉴(번호)를 제공하고 입력받은 음료의 값 출력하기)
//	1. 콜라(2000) 2. 사이다(1800) 3. 커피(1900)
import java.util.Scanner;

public class Drink {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int DrinkNum = scan.nextInt();
		String NameAndPrice = "";
		
		if (DrinkNum == 1) {
			NameAndPrice = "콜라 : 2000원";
		}
		if (DrinkNum == 2) {
			NameAndPrice = "사이다 : 1800원";
		} 
		if (DrinkNum == 3) {
			NameAndPrice = "커피 : 1900원";
		}
		System.out.println(NameAndPrice);
	}
}