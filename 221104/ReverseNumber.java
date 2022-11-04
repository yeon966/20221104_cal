import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int left = scan.nextInt();
		int right = scan.nextInt();
		
		String strFromLeft = String.valueOf(left);
		String strFromRight = String.valueOf(right);
		
		StringBuilder sb = new StringBuilder(strFromLeft);
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse.equals(strFromRight));
	}
}