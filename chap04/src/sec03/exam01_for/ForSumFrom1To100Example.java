package sec03.exam01_for;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			//sum += i; sum�� ���� i�� ���ؼ� �ٽ� sum�� �����϶�� ���� ������
			sum = sum + i;
		}
		
		System.out.println("1~100������ ��:" + sum);
		//System.out.println("1~" + (i-1) + "������ ��:" + sum);
		
		/*
		// int i�� System.out.println("1~" + (i-1) + "������ ��:" + sum);���� ���ȴ�.
		int i = 0;
		
		// �ʱ�ȭ�Ŀ��� �ݵ�� ������ ������ �ʿ�� ���� �ۿ��� ������ �� ���� �Է����൵ �ȴ�.
		for(i=1; i<=100; i++) {
			//sum += i; sum�� ���� i�� ���ؼ� �ٽ� sum�� �����϶�� ���� ������
			sum = sum + i;
		}
		// i�� 101�� �Ǵ� ������ for�� �������´�.
		System.out.println("1~" + (i-1) + "������ ��:" + sum);
		*/
	}

}
