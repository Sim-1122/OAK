package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			//sum += i; sum의 값에 i를 더해서 다시 sum에 저장하라는 대입 연산자
			sum = sum + i;
		}
		
		System.out.println("1~100까지의 합:" + sum);
		//System.out.println("1~" + (i-1) + "까지의 합:" + sum);
		
		/*
		// int i는 System.out.println("1~" + (i-1) + "까지의 합:" + sum);까지 사용된다.
		int i = 0;
		
		// 초기화식에서 반드시 변수를 선언할 필요는 없고 밖에서 선언한 후 값을 입력해줘도 된다.
		for(i=1; i<=100; i++) {
			//sum += i; sum의 값에 i를 더해서 다시 sum에 저장하라는 대입 연산자
			sum = sum + i;
		}
		// i가 101이 되는 시점에 for를 빠져나온다.
		System.out.println("1~" + (i-1) + "까지의 합:" + sum);
		*/
	}

}
