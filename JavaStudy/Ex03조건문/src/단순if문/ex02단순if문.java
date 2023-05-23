package 단순if문;

import java.util.Scanner;

public class ex02단순if문 {

	public static void main(String[] args) {
		
		//1. 입력도구 꺼내오기
		//2. 나이를 입력하세요 출력
		//3. int 타입 변수 age에 키보드로 나이 입력받기
		//4. age가 20보다 크거나 같은 지 판단하기(단순 if문 사용)
		//5. age가 20보다 크다면 "성인입니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age1 = sc.nextInt();
		
		if (age1 >= 20) {
			System.out.println("성인입니다.");
		}
		
		System.out.print("나이를 입력하세요 : ");
		int age2 = sc.nextInt();
		
		if (age2 >= 20) {
			System.out.println("성인입니다.");
		}
		
		
		
		
		
	}

}
