package java_day01;

public class EX5_variable2 {
	public static void main(String[] args) {
		// 문자형과 정수형의 관계 
		int data = 'A';
		char ch2 = 65;		// 문자형 < 정수형 (아스키 코드) 
		
		// 아스키 코드 65-90 => A-Z / 97-122 => a-z
		System.out.println(data);
		System.out.println(ch2);
		
		String msg = "";
		System.out.println("msg 출력: " + msg);
//		System.out.println('');		// 문자는 공백불가
//		char msg1 = '';  <- X
		
		
	}
}
