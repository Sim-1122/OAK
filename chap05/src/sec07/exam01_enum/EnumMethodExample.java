package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		// 
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal�� ���� ����� ������ �� �������� SUNDAY�� ���� �������� ����Ʊ� ������ 6���̴�.
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compare�� ������ ���� ��Ÿ����.
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; // 2
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result2); // 2 - 0
		System.out.println(result1); // 0 - 2
		
		// valueOf ���ڿ��� ������ ���ڿ��� ���� �ִ� ���� ��ü�� ������ return ���ش�.
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY ||/*or*/ weekDay == Week.SUNDAY) {
			System.out.println("�ָ� �̱���");
		} else {
			System.out.println("���� �̱���");
		}
		
		// ���� ��ü�� �迭�� ���� ������  return �Ѵ�.
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day); // day�� ����ϰ� �Ǹ� ���� ��ü�� ���� ��µȴ�.
		}
	}

}
