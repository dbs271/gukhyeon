package java_day01;

public class EX2_printTest2 {

	public static void main(String[] args) {
		System.out.println("내 이름은 \"윤국현\" 이에요."); // \" = "(문자로 추력)
		System.out.println("내가 좋아하는 음식은? \n케이크"); // \n > enter 역할  
		//println()출력문 단축키: sysout + Ctrl + space | Mac = sysout + option + space(기존 option 대신 ctrl 키였으나 설정 변경함)
	
		System.out.println("코로나\t거리두기 "); // \t ? tab 역할 
		System.out.println(3 + "단계"); // 숫자 + 문자열
		// 문자열과 다른 정수, 실수, 문자는 + 로 연결한다.  
		// 문자란 '' 로 묶인 것.  
		// 문자열이란 "" 로 묶인 것.  
		System.out.println(2 + 2);
		System.out.println(4 * 10);
		
		// 35단계 라고 나온 이유?
		System.out.println(3 + ' ' + "단계");		// 공백은 스페이스다 아스키코드에 따라 스페이스는 32 그렇기에 3 + 32 = 35 라는 값이 출력됨 
	}

}



