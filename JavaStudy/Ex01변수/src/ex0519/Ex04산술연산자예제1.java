package ex0519;

import java.util.Scanner;

public class Ex04산술연산자예제1 {

	public static void main(String[] args) {

		//1.두 수를 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		//2. 더한결과 출력하기
		System.out.println("더한 결과 값 : "+(num1 + num2));
		//3. 뺀결과 출력하기
		System.out.println("뺀 결과 값 : " + (num1 - num2));
		//4. 곱한결과 출력하기
		System.out.println("곱한 결과 값 : " + num1*num2);
		//5. 나눈결과 출력하기
		System.out.println("나눈 결과 값 : " + (num1/(double)num2));
//		double a = num1;
//		double b = num2;
//		System.out.println("나눈 결과 값" + a / b );
		
		
		
		
		
		

	}

}
