// 동해물과 백두산이 마르고 닳도록
public class StringSub {
	public static void main(String[] args){
		// 동해물과 백두산이
		// 위의 문자열을 공백을 기준으로
		// 두 단어를 각 줄로 출력해보세요.
		
		// 동해물과
		// 백두산이
		
		String krSong = "동해물과 백두산이";
		
		String sub = krSong.substring(0, 4);
		String sub2 = krSong.substring(5, 9);
		System.out.println(sub);
		System.out.println(sub2);
	}

}