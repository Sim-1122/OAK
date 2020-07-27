package sec02.exam02_switch;

public class SwitchExample {

	public static void main(String[] args) {

		/* Math.random()은 0≤Math.random＜1의 범위 값을 가진다.
		 따라서 Math.random()*6은 0≤Math.random*6＜6의 범위 값을 가지고
		  1≤ 1,2,3,4,5,6 ＜7의 범위를 가진다. */
		int num = (int)(Math.random()*6) + 1;
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}

	}

}
