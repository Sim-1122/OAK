package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		// 
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal은 열거 상수의 선언을 한 순번으로 SUNDAY가 가장 마지막에 선언됐기 때문에 6번이다.
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compare는 순번의 차를 나타낸다.
		Week day1 = Week.MONDAY; // 0
		Week day2 = Week.WEDNESDAY; // 2
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result2); // 2 - 0
		System.out.println(result1); // 0 - 2
		
		// valueOf 문자열과 동일한 문자열을 갖고 있는 열거 객체의 번지를 return 해준다.
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY ||/*or*/ weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");
		}
		
		// 열거 객체의 배열의 생성 번지를  return 한다.
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day); // day를 출력하게 되면 열거 객체의 열이 출력된다.
		}
	}

}
