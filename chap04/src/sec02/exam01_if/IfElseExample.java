package sec02.exam01_if;

public class IfElseExample {

	public static void main(String[] args) {
		
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		/* 여기에서 score는 85이기 때문에 정상흐름으로 실행되다가
		 조건문에서 false가 되어 else로 넘어가 실행하게 된다. 
		 score가 95로 바뀌게 되면 if문으로 실행하게 되는 것을 볼 수 있다. */
	}
}
