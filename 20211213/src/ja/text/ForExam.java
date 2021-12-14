package ja.text;

import java.util.Scanner;
public class ForExam {

	public static void main(String[] args) {
		
		//'Lines ?' 3
		//***
		//***
		//***
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		num = sc.nextInt();
		
		
		for (int j = 0; j<num ; j++) {
		for(int i = 0; i < num; i++ ){
			System.out.print("*");
		}
		System.out.println("");
		}
	}

}
