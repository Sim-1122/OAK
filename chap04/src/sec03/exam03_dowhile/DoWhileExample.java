package sec03.exam03_dowhile;

// Scanner가 존재하는 패키지
//import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		int i = 0;
		  
		do { System.out.println(i); i++; } while(i<=10); // 세미콜론 붙이는 것 잊지말기!!
		  
		System.out.println();
		System.out.println("프로그램 종료");
		
		// Scanner 변수는 키보드로부터 문자열을 읽는 변수로 쓰인다.
		// Scanner는 클래스 타입이기 때문에 Scanner가 존재하는 패키지를 입력해줘야 한다.
		// 컨트롤 + 쉬프트 + O를 동시에 입력하여 import를 추가한다.
		
		/*Scanner scanner = new Scanner(System.in);
		
		// nextLine()은 엔터키를 누르기 전까지의 문자열을 한번에 읽는 메소드이다.
		String inputString = scanner.nextLine();
		
		System.out.println(inputString);*/
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		// 스캐너라고 하는 객체를 생성하는 코드
		/*Scanner scanner = new Scanner(System.in);
		String inputString;
		  
		do { 
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
		} while( !inputString.equals("q") ); // 세미콜론 붙이는 것 잊지말기!!
		
		  
		System.out.println();
		System.out.println("프로그램 종료");*/
		
		 
	}

}
