package verify;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택> ");
			
			// 키보드로 부터 입력된 문자열을 받기 위해서는 nextLine을 입력했었는데 수를 얻기 위해서는 nextInt를 입력한다.
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.print("예금액> ");
					// 사용자가 입력한 수를 balance에 더해서 저장한다. 
					balance += scanner.nextInt();
					break;
				case 2:
					System.out.print("출금액> ");
					balance -= scanner.nextInt();
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:
					run = false;
					break;
			}
			
			System.out.println();
		}
		
		scanner.close();
		System.out.println("프로그램 종료");
	}

}
