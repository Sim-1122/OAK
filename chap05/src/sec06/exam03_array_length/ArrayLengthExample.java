package sec06.exam03_array_length;

public class ArrayLengthExample {

	public static void main(String[] args) {
		
		// intŸ�� �迭 ����
		int[] scores = { 83, 90, 87 };
		
		int sum = 0;
		// length�� �迭�� �Ӽ����� ������ 3�� �������� ��ĥ �� ���� final field�̴�.
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("����: " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("���: " + avg);
		
	}

}
