package javaStudy;

public class Bus extends Car {
	int fee;
	public Bus(String name, itn number, int fee) {
		
		supe();
		this.fee = fee;
	}
	
	/*
	public void ppangppang() {
		System.out.println("PPANG PPANG!!");
	}
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
	}
*/
}
