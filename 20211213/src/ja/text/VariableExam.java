package ja.text;

public class VariableExam {
	
	/*변수의 영향 범위
	 * 
	 * 지역변수와 전역변수
	 */
	
		int a; // 전역변수 -  전역변수는 매소드 밖에서 선언  
		//전역변수 사용은 되도록 쓰지말자
		
		public int varTest(VariableExam testvar) {
			a++;
			return a;
		}
	
		public static void main(String[] args) {
			//int a  = 1;
			VariableExam testvar = new VariableExam();
			testvar.a = 1;
			testvar.varTest(testvar);
			System.out.println(testvar.a);
		}
	}


