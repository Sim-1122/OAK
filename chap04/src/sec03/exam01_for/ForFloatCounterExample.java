package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		
		/* x는 0.1부터 시작한다.
		부동소수점 방식에서는 0.1방식이 잘 되지 않는다.
		가능하면 정수 연산을 하는것이 좋다. */
		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}

	}

}
