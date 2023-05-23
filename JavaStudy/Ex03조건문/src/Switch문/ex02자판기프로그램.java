package Switch문;

import java.util.Scanner;

public class ex02자판기프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.이구동성(700) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
		int cho = sc.nextInt();
		
		int a = 700;
		int b = 1000;
		int c = 500;
		
		if (cho == 1) {
			System.out.println("잔돈 : " + (money - 700));
		}else {
			System.out.println("돈이 부족해요 ㅠㅠ");
			System.out.println("잔돈 : " + money);
		}
//		}else if (cho == 2 ) {
//			System.out.println("잔돈 : " + (money - 1000));
//		}else if (cho == 3 ){
//			System.out.println("잔돈 : " + (money - 500));
//		}
//		
		
		
		

		
	}

}
