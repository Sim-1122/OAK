package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		
		/* Math.random()�� 0��Math.random��1�� ���� ���� ������.
		 ���� Math.random()*6�� 0��Math.random*20��20�� ���� ���� ������
		  81�� Math.random*20 + 81 ��101�� ������ ������. */
		int score = (int)(Math.random()*20) + 81;
		System.out.println("����: " + score);
		
		// ���ڿ��� �����ϱ� ���� String Ÿ���� �����Ѵ�.
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("����: " + grade);

	}

}
