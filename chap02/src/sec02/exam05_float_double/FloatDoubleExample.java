package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		
		
		// �Ǽ��� ����
		double var1 = 3.14;
		
		// �ڹٴ� �Ǽ����ͷ��� 8����Ʈ double Ÿ������ �����ϱ� ������ ����� ���� float�� ������ �� ���� �����̴�. 
		//float var2 = 3.14;
		
		// f �Ǵ� F�� �ٿ� 3.14�� 4����Ʈ �Ǽ��� ����� float ������ �����Ѵ�.
		float var3 = 3.14F;
		
		// ���е� �˻�
		// double Ÿ���� ��� 
		double var4 = 0.1234567890123456789;
		
		// float�� ��� ������ 23��Ʈ�� ǥ���ϱ� ������ 0.12345678������ ������ �� �ִ�. ������ �ڿ� ���� ǥ���� �� ����.
		float var5 = 0.1234567890123456789F;
		
		// ����Ѵ�.
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		// e����ϱ�
		int var6 = 3000000;
		// ���� �κ��� �ֱ� ������ ������ ������ ǥ���ȴ�. ������ �ε��Ҽ��� ����� �Ǽ�Ÿ�Կ� ������ �ؾ� �Ǵµ� �ڿ� F�� ���� �ʱ� ������ double Ÿ������ ǥ���ؾ� �Ѵ�.
		double var7 = 3e6;
		float var8 = 3e6F;
		
		// ����Ѵ�.
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
