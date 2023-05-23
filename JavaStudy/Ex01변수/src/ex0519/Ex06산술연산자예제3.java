package ex0519;

import java.util.Scanner;

public class Ex06산술연산자예제3 {

	public static void main(String[] args) {
		
//		// 1. 총 몇초인지 입력받기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("초 입력 : ");
//		
//		int sec = sc.nextInt();
//		
//		System.out.println(sec/3600+"시" +((sec%3600)/60) +"분"+ ((sec%3600)%60)+"초");
		
		
		
		// 1. 총 몇초인지 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("초 입력 : ");
		
		int totalSecond = sc.nextInt();
		// 2. 몇시간?
		int hour = totalSecond/3600;
		// 3. 몇 분?
		int min = totalSecond % 3600 / 60;
		// 4. 몇 초??
		int second = totalSecond % 60;
		// 5. 결과 출력
		// 1시간 2분 3초		
		System.out.println(hour + "시"+ min + "분" + second + "초");
		
		//계산 시 항 중 가장 큰 데이터값을 따라간다 
		//자바책 81페이지 연산자 우선순위
				
				
				
				
				
				
				
				
	}

}
