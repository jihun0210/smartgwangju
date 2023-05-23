package 다중if문;

import java.util.Scanner;

public class ex02다중if문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int totalScore = sc.nextInt();
		
		if (totalScore >= 90) {
			System.out.println("A학점입니다!");
		}else if(totalScore < 90 && totalScore >= 80) {
			System.out.println("B학점입니다!");
		}else if(totalScore < 80 && totalScore >= 70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		
		System.out.print("점수 입력 : ");
		int totalScore2 = sc.nextInt();
		
		if (totalScore2 >= 90) {
			System.out.println("A학점입니다!");
		}else if(totalScore2 < 90 && totalScore2 >= 80) {
			System.out.println("B학점입니다!");
		}else if(totalScore2 < 80 && totalScore2 >= 70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		
		System.out.print("점수 입력 : ");
		int totalScore3 = sc.nextInt();
		
		if (totalScore3 >= 90) {
			System.out.println("A학점입니다!");
		}else if(totalScore3 < 90 && totalScore3 >= 80) {
			System.out.println("B학점입니다!");
		}else if(totalScore3 < 80 && totalScore3 >= 70) {
			System.out.println("C학점입니다!");
		}else {
			System.out.println("D학점입니다!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
