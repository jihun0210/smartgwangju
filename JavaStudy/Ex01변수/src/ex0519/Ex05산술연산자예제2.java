package ex0519;

import java.util.Scanner;

public class Ex05산술연산자예제2 {

	public static void main(String[] args) {

		// 1.============================
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		double num1 = sc.nextDouble();
//		
//		int num2 = (int)num1;
//		System.out.println("결과값 : " + (num2/100) * 100);
		
//		// 2. ========================
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.println("결과값 : " + (num1/100) * 100);
		
		//1. 숫자 하나 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		//2. 백의자리 이하를 버린 결과 계산
		// 입력 : 456
		// num - num%100 ==> 400 "결과 입력 : " + result
		int result = num - num % 100;
		
		//3. 결과를 출력
		System.out.println("결과 입력 : " + result);
		
		
	}

}
