package 단순if문;

import java.util.Scanner;

public class ex03단순if문 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. : ");
		int num1 = sc.nextInt();
		
		if (num1 % 3 ==0 && num1 % 5 ==0) {
			System.out.println("3과 5의 배수입니다.");
		}
		
		

	}

}
