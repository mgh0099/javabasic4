package ja.text;

import java.util.Scanner;
public class ifExam {

	public static void main(String[] args) {

		
		
		//'점수를 입력하세요?'
		//90점 이상이면 'A'
		//80점 이상이면 'B'
		//70점 이상이면 'C'
		//60점 이상이면 'D'
		//0~59점 이상이면 'F'
		//당신의 학점은 ''입니다.
		

		int a = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요? :");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

		
		if(a>=90) {
			grade = 'A';
	}else if(a>=80){
		grade = 'B';
	}else if(a>=70){
		grade = 'C';	
	}else if(a>=60){
		grade = 'D';
	} else {
		grade = 'F';
	}
		System.out.print("당신의 학점은 " + grade + " 입니다. ");
		System.out.println("점수는 "+a+"점 입니다");
		
		
//		if(조건1) {
//			System.out.println("true일때 실행");
//		}else if(조건2){
//			System.out.println("true일때 실행");		
//		} else {
//			System.out.println("False일때 실행");
//		}

	}

}
