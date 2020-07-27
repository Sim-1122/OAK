package sec03.exam02_while;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		} // i가 101이 되는 시점에 while문을 나온다.
		
		System.out.println("1~" + (i-1) + "까지의 합:" + sum);
		
		/* 지정된 횟수만큼 도는 경우는 for문이 간단하지만 
		변수 선언과 변수 증가를 해당 위치에 적으면 while문 또한 가능하다. */
	}

}
