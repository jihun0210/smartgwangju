package ex0518;

public class Ex01변수 {

	public static void main(String[] args) {

		//주석
		// ctrl + - : 글자 크기 조절
		// ctrl + space : 자동완성 단축키
		// JVM --> main 실행 {중괄호 안 코드}
		// {} -> body
		// Hello World 글자 출력해보기
		// syso + 자동완성 --> System.out.println();
		
		System.out.println("Hello World!");
		
		// 문자열 ("   ") 
		// 변수 선언 : 데이터를 저장할 상자를 만들기
		//  ㄴ어떤 데이터가 들어갈 지, 무슨 이름으로 부를 지 지정
		int a;
		
		// 값 대입
		a = 10;
		System.out.println(a);
		
		// a 안에 값을 15로 바꾸고 싶으면?
		a = 15;
		System.out.println(a);
		
		// @@상수@@ : 변하지 '않는' 수
		// 숫자를 담을 b라는 상자 만들기
		// b에 3 담기
		final int b = 3;
			
		
		// b의 값을 10으로 바꾸기 -> 상수이기 때문에 불가
		// ctrl + d --> 한줄 삭제 단축키
		// alt + 방향키(위,아래)
		// ctrl + alt +(위,아래) : 코드 한줄 복사
		
		// @@@@@ 변수명 규칙 @@@@ 
		// 1. (필수규칙) 키워드, 중복된 변수명 사용불가
		
		// 2. 변수명은 길이 제한X, 대소문자는 가림
		//    ㄴ A, a 
		
		// 3. 숫자로 시작하면 안됨!
		//    ㄴ a10은 가능 / 10a는 X
		
		// 4. (필수규칙) 특수문자는 $, _ 두가지만 사용 가능
		//    ㄴ a$bc 가능
		//    ㄴ a#bc 불가능
		
		// @@프로그래머 사이에서 소통을 위해 사용되는 규칙
		
		// 1. 변수명은 소문자로 시작해야 한다
		//    ㄴ 패키지 이름은 소문자로 시작
		//    ㄴ 클래스파일의 이름은 대문자로 시작
		
		// ex0518 안에 Ex01변수라는 클래스파일이 있다.
		// ex0518.Ex01변수
		// ㄴ패키지파일 ㄴ클래스파일
		
		// 2-1. _(언더바)를 각 단어의 사이를 연결 (python)
		//        ex) default_file_rename_policy
		// 2-2. 각 단어의 시작 글자를 대문자로 작성
		// defaultFileRenamePolicy > 카멜식 기법(JAVA에서 많이 사용)
		
		
		
		
		
		
		
	}

}
