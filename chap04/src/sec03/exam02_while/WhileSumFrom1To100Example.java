package sec03.exam02_while;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		} // i�� 101�� �Ǵ� ������ while���� ���´�.
		
		System.out.println("1~" + (i-1) + "������ ��:" + sum);
		
		/* ������ Ƚ����ŭ ���� ���� for���� ���������� 
		���� ����� ���� ������ �ش� ��ġ�� ������ while�� ���� �����ϴ�. */
	}

}
