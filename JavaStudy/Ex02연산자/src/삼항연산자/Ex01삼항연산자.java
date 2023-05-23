package 삼항연산자;

import java.util.Scanner;

public class Ex01삼항연산자 {

	public static void main(String[] args) {
		
		
		//삼항연산자
		//조건문 ? 실행문1 : 실행문2
		// --> 조건문이 참이라면 실행문1 실행
		// --> 조건문이 거짓이면 실행문2 실행
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(num%2==1? "홀수입니다.":"짝수입니다.");
		
		int num1 = 8;
		int num2 = 7;
		
		String result = num1 < num2 ? "num2가 더 크다." : "num1이 더 크다.";
		System.out.println(result);
		
		
		
		
		
		
		

	}

}
