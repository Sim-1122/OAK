package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		
		/* 키보드로 입력한 3개의 숫자를 감지해서
		현재 속도를 증가 할 것인지 감소 할 것인지 프로그램을 종료 할 것인지를 
		while문으로 입력을 받고 if문을 통해 처리하는 프로그램이다. */
		
		// 후반부 IO(Input, Output)입출력에서 설명된다.
		// 키보드의 키 코드 값을 읽는 메소드이다 ex) 키보드 1이 KeyCode값으로 49가 된다.
		// 예외 처리를 위해 throw Exception을 입력한다.
		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			// 만일 keyCode가 13이 아니고 10이 아니라면 = 엔터키가 아니라면
			// 13번과 10번이 제외되기 때문에 1번만 돈다.
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("---------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("---------------------------");
				// println은 출력을 한 후 행을 내리는 기능을 하고 print는 행을 바꾸지 않고 계속 출력한다.
				System.out.print("선택: ");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 50) {
				speed--;
				System.out.println("현재 속도=" + speed);
			} else if(keyCode == 51) {
				run = false;
			}
		}
		// 엔터는 Carriage Return and Line Feed ≒  \n ≒ Enter
		System.out.println("프로그램 종료");
	}

}
