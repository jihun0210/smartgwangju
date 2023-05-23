package 삼항연산자;

import java.util.Scanner;

public class Ex04삼항연산자 {

	public static void main(String[] args) {
		
		// 1. 입력 도구 꺼내오기
		// 2. 농구공의 개수를 입력하세요. 출력하기 (개행없이)
		// 3. 농구공 개수 입력받기
		// 4. 필요한 상자의 수 구하기(삼항연산자 사용)
		// --> 상자 한개 당 담을 수 있는 농구공 : 5개
		// ex) 농구공 33개 -> 상자는 7개 필요함!
		// **수식으로 풀어보기**
		// 5. 결과 출력하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		int result1 = num1 % 5 == 0 ? num1 / 5 : num1 / 5 + 1;
		
		System.out.println("필요한 상자의 수 : "+result1);
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int result2 = num2 % 5 == 0 ? num2 / 5 : num2 / 5 + 1;
		
		System.out.println("필요한 상자의 수 : "+result2);
		
		
		
		

	}

}
