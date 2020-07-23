package sec03.exam03_accuracy;

public class FromInToDouble {

	public static void main(String[] args) {
		
		// 수가 온전히 복원됐기 때문에 0이 나온다.
				int num1 = 123456780;
				int num2 = 123456780;
				
				double num3 = num2;
				num2 = (int) num3;
				
				int result = num1 - num2;
				System.out.println(result);
				
	}
}
