package sec02.exam02_switch;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		
		/* Math.random()은 0≤Math.random＜1의 범위 값을 가진다.
		 따라서 Math.random()*6은 0≤Math.random*4＜4의 범위 값을 가지고
		  8≤ Math.random*4 + 8 ＜12의 범위를 가진다. */
		int time = (int)(Math.random()*4) + 8;
		System.out.println("[현재 시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 합니다.");
			default:
				System.out.println("외근을 나갑니다.");
				
		}
	}

}
