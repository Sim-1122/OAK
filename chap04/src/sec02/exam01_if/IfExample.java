package sec02.exam01_if;

public class IfExample {

	public static void main(String[] args) {
		
		// 
		int score = 93;
		
		// 비교연산자를 사용해 산출 결과가 true 또는 false가 나오기 때문에 조건식이 성립된다.
		if( score>=90 ) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		}
		
		// 비슷한 조건문 만들기
		if( score<90 ) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B 입니다.");
		}
		
		/* 여기서의 흐름은 중괄호를 기준으로 밑으로 쭉 내려간다. 
		2개의 if문을 만나 첫번째 조건문이 실행되고 두번째는 실행되지 않는다. */
		
	}
}
