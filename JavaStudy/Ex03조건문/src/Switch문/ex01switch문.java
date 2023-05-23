package Switch문;

import java.util.Scanner;

public class ex01switch문 {

	public static void main(String[] args) {
		
		
//		switch (식) {
//		case 값 : 
//			System.out.println("실행문장1");
//			break;
//		case 값2 : 
//			System.out.println("실행문장2");
//			break;
//		default : 
//			System.out.println("실행문장3");
//			break;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		switch(totalScore / 10) {
		case 10:
//			System.out.println("A학점입니다.");
//			break;
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		default:
			System.out.println("D학점입니다.");
			break;
		}
		
		
		
		
		
		
		

	}

}
