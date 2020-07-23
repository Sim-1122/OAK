package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		
		// 실수값 저장
		double var1 = 3.14;
		
		// 자바는 실수리터럴을 8바이트 double 타입으로 간주하기 때문에 사이즈가 작은 float에 저장할 수 없기 때문이다. 
		//float var2 = 3.14;
		
		// f 또는 F를 붙여 3.14를 4바이트 실수로 만들어 float 변수에 저장한다.
		float var3 = 3.14F;
		
		// 정밀도 검사
		// double 타입의 경우 
		double var4 = 0.1234567890123456789;
		
		// float의 경우 가수를 23비트로 표현하기 때문에 0.12345678까지를 저장할 수 있다. 때문에 뒤에 수를 표현할 수 없다.
		float var5 = 0.1234567890123456789F;
		
		// 출력한다.
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		// e사용하기
		int var6 = 3000000;
		// 지수 부분이 있기 때문에 가수와 지수로 표현된다. 때문에 부동소수점 방식인 실수타입에 저장을 해야 되는데 뒤에 F가 붙지 않기 때문에 double 타입으로 표현해야 한다.
		double var7 = 3e6;
		float var8 = 3e6F;
		
		// 출력한다.
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
