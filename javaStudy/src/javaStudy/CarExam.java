package javaStudy;

public class CarExam {

	public static void main(String[] args) {
		// 생성자는 반드시 1개 이상 존재해야만 한다.
		// 개발자가 만들지 않으면 자동으로 기본생성자
		// default constructor를 자바가 만들어 준다.
		Car car = new Car();
		if( car instanceof Machine) {
            System.out.println("Car가 Machine을 상속받았습니다.");
        }
        else{            
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }

	}

}
