package ja.text;

public class Animal {

	String name;
	
	public void setName(String n) {
		this.name = n; //this는 호출한 객체이름
	}
	
	
	/*public void setName(String n) {
		this.name = n; //this 는 호출한 객체이름이다.
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal(); //객체 생성
		cat.setName("boby");
		System.out.println(cat.name);
		
		Animal dog = new Animal(); //객체 생성
		dog.setName("happy");
		System.out.println(dog.name);
	}
*/
}
