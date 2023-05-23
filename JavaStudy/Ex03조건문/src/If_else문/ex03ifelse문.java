package If_else문;

import java.util.Scanner;

public class ex03ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		
		System.out.print("나이를 입력하세요 : ");
		int age1 = sc.nextInt();
		
		System.out.print("인원 수를 입력하세요 : ");
		int cnt1 = sc.nextInt();

		if(age1 <20) {
			System.out.println("총 "+ 5000 * cnt1 / 2  + "원 입니다.");
		}else {
			System.out.println("총 "+ 5000* cnt1 + "원 입니다.");
		}
	
		// 2번째
		System.out.print("나이를 입력하세요 : ");
		int age2 = sc.nextInt();
		
		System.out.print("인원 수를 입력하세요 : ");
		int cnt2 = sc.nextInt();

		if(age2 <20) {
			System.out.println("총 "+(5000 * cnt2)/2 + "원 입니다.");
		}else {
			System.out.println("총 "+ 5000*cnt2 + "원 입니다.");
		}
		
//		====에버랜드에 오신 걸 환영합니다!====
//				나이를 입력하세요 : 15
//				인원 수를 입력하세요 : 5
//				총 12500원 입니다.
//				나이를 입력하세요 : 20
//				인원 수를 입력하세요 : 5
//				총 25000원 입니다.

	}

}
