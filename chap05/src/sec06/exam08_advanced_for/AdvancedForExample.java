package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		
		// �ش� �迭�� �׸��� ���������� ������ for���� �̿��ϸ� �����ϰ� ǥ���� �� �ִ�.
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum = 0;
		// scores�� �׸�ŭ �ݺ��Ѵ�.
		for(int score : scores) {
			sum += score;
		}
		System.out.println("���� ���� = " + sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("���� ��� = " + avg);

	}

}
