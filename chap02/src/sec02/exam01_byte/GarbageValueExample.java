package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		
		// byte 변수를 표현한다..
		byte var1 = 125;
		
		// 증가연산자 ++을 표현한다..
		var1++;
		System.out.println(var1);
		
		// 증가연산자 ++을 표현한다.
		var1++;
		System.out.println(var1);
		
		// 값의 범위를 초과할 경우 최소값부터 다시 반복 저장을 한다.
		var1++;
		System.out.println(var1);
		
		// byte와 int형 변수를 표현한다.
		byte var2 = 125;
		int var3 = 125;
		
		for(int i=0; i<5; i++) {
			var2++;
			var3++;
			System.out.println("var2: " + var2 + "\t" + "var3: " + var3);
		
		} // 3번째 실행의 결과와 같이 예상치 못한 -128등의 값들을 쓰레기 값이라고 한다.
	}
}
