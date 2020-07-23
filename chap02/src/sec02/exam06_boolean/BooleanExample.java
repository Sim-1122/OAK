package sec02.exam06_boolean;

public class BooleanExample {

	public static void main(String[] args) {
		
		
		// true, false를 표현 하는 변수타입 boolean을 선언한다.
		boolean stop =  false;
		
		// 만일 stop이 true면 "중지합니다"를 출력, false면 "시작합니다"를 출력한다.
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}
}
