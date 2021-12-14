package ja.text;

public class HouseDog extends Dog {

	public HouseDog(String name) {
		this.setName(name);
	}
	
	public HouseDog(int type) {
		if(type == 1) {
			this.setName("york");
		}else if (type == 2) {
			this.setName("bulldog");
		}
	}
	
	public void sleep() {
		System.out.println(this.name + " zZzZ in house ");
	}

	public void sleep(int hour) {
		System.out.println(this.name+"zzz in house for" + hour + "hours");
		
	}
	
	
	public static void main(String[] args) {
		HouseDog houseDog = new HouseDog("happy"); // 문자열로 생성자 호출
		//houseDog.setName("happy");
		System.out.println(houseDog.name);
		//houseDog.sleep();
		//houseDog.sleep(3);
		
		HouseDog houseDog2 = new HouseDog(1); // 숫자로 생성자 호출

		System.out.println(houseDog2.name);
	}
}
