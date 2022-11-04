public class BlockScope {
	public static void main(String[] args){
		int a = 10; // 지역 변수(local variable)
		{// block scope
			System.out.println("문장1");
			System.out.println("변수값 확인 : " + a);
		}
		System.out.println("변수값 확인 : " + a);
		System.out.println("프로그램 정상 종료");
	}
}