package sec02.exam04_long;

public class LongExample {

	public static void main(String[] args) {
		
		// long 변수를 선언한다.
		long var1 = 10;
		
		//
		long var2 = 20L;
		
		// 4바이트로 표현할 수 없는 수는 마지막에 L 또는 l을 붙인다.
		//long var3 = 10000000000;
		
		long var4 = 10000000000L;
		
		//출력한다.
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
