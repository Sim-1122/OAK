package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		
		/* Math.random()은 0≤Math.random＜1의 범위 값을 가진다.
		 따라서 Math.random()*6은 0≤Math.random*20＜20의 범위 값을 가지고
		  81≤ Math.random*20 + 81 ＜101의 범위를 가진다. */
		int score = (int)(Math.random()*20) + 81;
		System.out.println("점수: " + score);
		
		// 문자열을 저장하기 위해 String 타입을 선언한다.
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
		
		System.out.println("학점: " + grade);

	}

}
