package sec02.exam01_byte;

public class GarbageValueExample {

	public static void main(String[] args) {
		
		// byte ������ ǥ���Ѵ�..
		byte var1 = 125;
		
		// ���������� ++�� ǥ���Ѵ�..
		var1++;
		System.out.println(var1);
		
		// ���������� ++�� ǥ���Ѵ�.
		var1++;
		System.out.println(var1);
		
		// ���� ������ �ʰ��� ��� �ּҰ����� �ٽ� �ݺ� ������ �Ѵ�.
		var1++;
		System.out.println(var1);
		
		// byte�� int�� ������ ǥ���Ѵ�.
		byte var2 = 125;
		int var3 = 125;
		
		for(int i=0; i<5; i++) {
			var2++;
			var3++;
			System.out.println("var2: " + var2 + "\t" + "var3: " + var3);
		
		} // 3��° ������ ����� ���� ����ġ ���� -128���� ������ ������ ���̶�� �Ѵ�.
	}
}
