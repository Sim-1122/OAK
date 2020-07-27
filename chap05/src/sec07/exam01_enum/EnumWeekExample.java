package sec07.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
		// Week ���� ������ ���� ��� 7���� �ϳ��� ������ �� �ִ�.
		// null�� �ʱ�ȭ
		Week today = null;
		
		// ��ǻ���� ��¥�� �������� return ���ش�.
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// �Ͽ����� 1, ������� 7�̴�. 
		System.out.println(week);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("���� ����: " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� ��縦 �մϴ�.");
		} else {
			System.out.println("������ �ڹ� �����մϴ�.");
		}
	}

}