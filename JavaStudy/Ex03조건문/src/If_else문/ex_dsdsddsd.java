package If_else문;

import java.util.Scanner;

public class ex_dsdsddsd {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 >> ");
		int money = sc.nextInt();
		
		System.out.println("메뉴를 고르세요");
		System.out.print("1.이구동성(700) 2.썬칩(1000원) 3.뽀빠이(500원) >> ");
		int cho = sc.nextInt();
		
		
		if(cho==1) {
			   if(money>=700) {
			      System.out.println("잔돈 : " + (money-700));
			         }
			   }else {
			      System.out.println("돈이 부족해요ㅜㅜ : " + money );
			   }
		if(cho==2) {
			if(money>=1000) {
				System.out.println("잔돈 : " + (money-1000));
			}
		}
			            
			         
			      
			      
			         
			     
			
			   
			   
			   
			   
			   

			

	}

}
