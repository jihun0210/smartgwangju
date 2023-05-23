package 삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 > num2 ? "두 수의 차 : " + (num1 - num2) : "두 수의 차 : " + (num2 - num1));
		
		System.out.print("첫 번째 정수 입력 : ");
		int num3 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num4 = sc.nextInt();
		
		System.out.println(num3 > num4 ? "두 수의 차 : " + (num3 - num4) : "두 수의 차 : " + (num4 - num3));
		
	}

}
