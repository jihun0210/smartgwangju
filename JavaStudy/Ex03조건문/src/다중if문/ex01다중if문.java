package 다중if문;

import java.util.Scanner;

public class ex01다중if문 {

	public static void main(String[] args) {

		//esle(조건식) XX else if(조건식) O
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		//첫번째
		if (num1==0) {
			System.out.println("0입니다.");
		}else if(num1%2 == 1) {
			System.out.println("홀수입니다.");
		}else if(num1%2 == 0){ 
			System.out.println("짝수입니다.");
		}
		
		//두번째
		System.out.print("숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if (num2==0) {
			System.out.println("0입니다.");
		}else if(num2%2 == 1) {
			System.out.println("홀수입니다.");
		}else if(num2%2 == 0){ 
			System.out.println("짝수입니다.");
		}
		
		//세번째
		System.out.print("숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if (num3==0) {
			System.out.println("0입니다.");
		}else if(num3%2 == 1) {
			System.out.println("홀수입니다.");
		}else if(num3%2 == 0){ 
			System.out.println("짝수입니다.");
		}
		
//		숫자를 입력하세요 : 2
//		짝수입니다.
//		숫자를 입력하세요 : 7
//		홀수입니다.
//		숫자를 입력하세요 : 0
//		0입니다.
		
		
		
		
		
		
		
	}

}
