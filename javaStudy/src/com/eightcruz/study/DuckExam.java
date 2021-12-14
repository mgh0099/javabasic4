package com.eightcruz.study;

public static class DuckExam {
	
	public static void main(String[] args) {
		
	
	Duck duck = new Duck();
	duck.sing();
	duck.fly();
	
	Bird b =new Bird();
	//추상 클래스는 부모 클래스로는 사용할수있지만
	//객체를 생성할수는없다.
	
	// 추상 클래스는 abstract 키워드를 클래스 앞에 사용한다.
	// 추상 클래스는 추상 매소드(인터페이스 명령어처럼)를 포함할수있다.
	// 추상 매소드도 abstract 키워드를 붙인다.
	// 추상 매소드는 객체 생성이 불가능하다.
	
}
	
}
