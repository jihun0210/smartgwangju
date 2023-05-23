package ex0518;

public class Ex02자료형 {

	public static void main(String[] args) {
		
		
		// ========= 기본 자료형 =========
		// 1. 논리 자료형
		boolean bool;
		bool = true; // false
		
		// 2. 문자 자료형 : 아스키코드표를 이용해 변환해서 저장
		//               ㄴ 숫자 연산이 가능하다.
		
		char c;  // char는 음수 저장X
		c = '6'; // A == 97
		System.out.println(c+0);
		// 3. 정수형
		byte b = 100; // byte : -128 ~ 127
		
		short s = 2023; // 2byte : 2의 16승
		
		// 기본!!
		int i = 10000000; // 4byte : 2의 32승 (java 기본값)
		
		// 기본인 int로 적용되기 때문에, 반드시 숫자 끝에 L을 붙여야한다.
		long l = 7000000000l; // int보다 큰 long을 쓰려고 하면 에러
		                      // 뒤에 L을 붙임
		
		// 4. 실수형
		// 기본이 double로 적용되므로, float은 숫자 뒤에 f를 붙여야한다
		float f = 3.14f;
		
		// 실수 기본형!
		double d = 3.14; // 8byte		
		// ================= 참조자료형 ===============
		// 참조자료형은 색 X, 문자열 길이 제한X
		// 문자열 
		String srt ="hello world";
		
		
		// 캐스팅(형변환)
		// 1. 자동 형변환 : 상대적으로 작은 자료형에서 큰 자료형으로 변환될 때
		int num = 10;
		
		double num2 = num;
		
		// 2. 강제형변환 : 상대적으로 큰 자료형에서 작은 자료형으로 변환될 때
		
		double pie = 3.14;
		
		int p = (int)pie;
		// ㄴ 실수 -> 정수 )소수점이 날아감 (반올림x)
		
		System.out.println(p);
		

	}

}
