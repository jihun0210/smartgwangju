package ex0519;

import java.util.Scanner;

public class Ex03연산자 {

	public static void main(String[] args) {
		
		// 연산자
		

//		 ㄴ 정해진 규칙에 따라 데이터를 처리햐여 결과 산출
//		 ㄴ 식 : 연산의 과정을 기술한 것, 피연산자(항)
//		 ㄴ 연산자 : 연산에 사용되는 기호
//
//		 # 이항 연산자 : 산술, 대입, 비교, 논리 연산자
//		 # 단항 연산자 : 증감연산자
//		 # 삼항연산자 
//		 
//		 ㄴ 
//		 ㄴ 10.0f / 7.0f = 1.4285715 (float과 float의 연산 -> 소수점 버리지 않음)
//		 ㄴ int 10 / float 7.0f = 1.428575 
//		                                  ㄴ 더 많은 정보를 담을 수 있는 float으로 
//		                                       자동(묵시적) 형 변환이 일어남
//		 ㄴ String "10" + String "7" = String "107" 
//		                                          ㄴ 문자열 끼리 계산이 되지 않는다.
//		 ㄴ 문자 자료형 + 숫자 자료형 _> 문자 자료형이 됨!
//
//		  ㄴ 10 + 7 + "1" = "171"
//		  ㄴ 8 + "1" + 2 = "812"
//		  ㄴ "1" + 5 +2 = "152"
//		   코드는 위에서 아래 좌에서 우 순으로
		
		// 데이터를 입력받기
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력받기
		// console 창에 입력한 데이터를 문자열 형태로 돌려줌
		// print출력하는 기능 + ln엔터(줄바꿈)를 눌러주는 기능 -> println
 		System.out.print("문자열을 입력해주세요 >> ");
		String text = sc.next();
		 
		// 숫자
		System.out.print("숫자를 입력해주세요 >> ");
		int num = sc.nextInt();
		
		
		
		
		
		
		
		
		

	}

}
