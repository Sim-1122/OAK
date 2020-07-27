package sec02.exam02_switch;

public class SwitchCharExample {

	public static void main(String[] args) {
		
		char grade = 'B';
		
		// 괄호 안에 들어가는 것은 정수타입이면 모두 가능. char 타입도 정수타입이기 때문에 가능하다.
		switch(grade) {
			/* 자바는 대소문자를 가린다.
			 2가지 예제가 동일한 코드를 실행해야 된다면 붙여서 사용할 수 있다. */
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("우수 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}

	}

}
