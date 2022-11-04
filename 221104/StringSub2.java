import java.util.Scanner;
public class StringSub2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("두 단어를 한줄로 입력해주세요 : ");
		String line = scan.nextLine();
		
		System.out.println(line.replace(' ' , '\n'));
		
		// int spaceIndex = line.indexOf(' ');
		// String startWord = line.substring(0 , spaceIndex);
		// String lastWord = line.substring(spaceIndex + 1);
		
		// System.out.println(startWord);
		// System.out.println(lastWord);
	}
}