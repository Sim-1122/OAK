package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		
		// 정밀도 손실에 의해 온전히 수가 옮겨지지 않았기 때문에 double로 넘어간다.
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		
	}
}
