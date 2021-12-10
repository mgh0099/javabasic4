/* 리스트
   배열과 비슷한 자료형, 크기가 정해지지않고
   동적으로 변한다. 배열은 그 크기가 생성시에 정해지지만 리스트는 그 크기가 정해지지않아 원하는 만큼 자유롭게 담을 수 있다.
   

   ArrayList



*/
import java.util.ArrayList;
class Main{
  public static void main(String[] args) {
    ArrayList pitches = new ArrayList();
  }
}







/*
  배열 array 여러개의 원소를 한번에 담는 자료형
              자료의 집합니다.
              배열은 그 길이가 고정된다.
              즉, 한번 생성하면 길이를 수정할 수 없다.


  int engScoreKim = 90;   //1개만 저장

  int[] engScore = {80,50,40,70,90};   
  String[] names = {"kim", "park". "son", "yoon", "Lee"}


*/

/*class Main{
  public static void main(String[] args){
    String[] weeks = new String[7];
    weeks[0] = "월";
    weeks[1] = "화";
    weeks[2] = "수";
    weeks[3] = "목";
    weeks[4] = "금";
    weeks[5] = "토";
    weeks[6] = "일";

    //String[] weeks = {"월","화","수","목","금","토","일"};

    //System.out.println(weeks[3]);
    
    //반복문 (for, while, (dp~while))
    
    for (int i = 0; i < weeks.length; i++) {
      System.out.println(weeks[i]);
    }

    System.out.println(weeks[7]);
    //ArrayIndexOutOfBoundsException
    //인덱스가 없는 위치를 지정
  }
}*/







//char 문자
/*
class Main{
  public static void main(String[] args) {
    char a = 'a';
    char b = 97;  //ascII 97 = a

    System.out.println(a);
    System.out.println(b);
  
  }
}
*/





/*
  Bool (불 Boolean) true, false 0
*/
/*
class Main{
  public static void main(String[] args) {

int base = 100;
int height = 185;
boolean isTall = height > base;

if (isTall){
  System.out.println("키가 큽니다");
}
  }
}
*/



/*
변수 : 어떤값을 보관하는 용도
int a; a라는 변수명애 정수를 보관할것이다.
String b; b라는 변수명에 문자열을 보관할것이다.

변수명 선언 규칙
1. 변수명은 숫자로는 시작할수없다. a100(0) 100a(x)
2. _ underscor는 사용 가능하지만 @ !
3. 예약어는 변수명으로 사용할수 없다. int, class..(x)


*. 한글은 사용하지 않는다. 가급적 소문자로 만든다.

잘못된 변수명 선언 예) 
int 2nd; // 숫자로 시작 불가능
String b#; // 특수문자 사용 불가능
int main; // 예약어 사용 불가능

자료형 (type)

int a; // 변수명 a는 int 자료형 변수임으로 a라는 변수에는 
       // 정수만 담을수있다. 1,2,10,100,300...

String b; // 변수명 b는 String 자료형 변수임으로 b라는 변수에는 문자열만 담을 수 있다. "boy", "Hello World".....
*/


/*
//클래스 블록 : 소스 코드의 가장 바깥쪽 블록
class Main{

  //매서드 블록(기능을 정의)
 
  public static void main(String[] args) {
    System.out.println("hello world");
  }
}

클래스 - 자바는 클래스 단위로 프로그램을 구성한다.
        클래스명은 명서로 만든다.
        여러개의 단어로 만들경우 각 단어의 첫 문자는 대문자로 만든다.
        예) class Raster {}
            class ImageSprite {}

매서드 - 하나의 클래스 안에는 매서드가 여러개 존재 할 수 있다.
        매서드명은 주로 동사로 만든다.
        여러개의 단어로 만들경우 처음시작하는 문자는 소문자로 시작하고 두번째 단어 부터는 대문자를 사용한다.
        예) run {}
            runFstP{}
            getBackground{}

* 권장 사항 : 변수명은 짧지만 의미가 있게 만든다.
              (변수명을 통해 사용 의도를 알 수 있다.) 

# 숫자 자료형 (number, integer)
  정수 1, 10  50....., 실수 3.14,7.8

  정수
  int(***)  int age = 21;

  long      long countStar = 545348112434516L;

  실수 3.14, 7.8 ....
  float               float pi = 3.14F;
  double(***)         douvle morePi = 3.141592;



*/


//indexOf 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
/*class Main{
  public static void main(String[] args) {


String a = "helloWorld";
System.out.println(a.indexOf("World"));
  
  }
}
*/

/*
string a ="hello";
string a ="hjave";
string a ="hello";

 System.out.println(a.equals(b));
  System.out.println(a.eayals(c));
*/



/*  
    int i = 0;

    System.out.println(++i);    // 하나를 증가하고 출력
    System.out.println(i++);    // 출력하고 하나 증가
    System.out.println(i);




/*    int i = 0;
    int j = 10;

    i++;  // 하나 증가 i = i + 1; i +=1;//
    j--;  // 하나 감소 i = j - 1; j -=1;//
    System.out.println(i);
    System.out.println(j);
    
    i++;
    ++i;

    j--;
    --l;
 */


// replaceAll 문자열 중 특정 문자열을 다른 문자열로 취환
/*class Main{
  public static void main(String[] args) {
    

String a = "helloWorld";
System.out.println(a.replaceAll("World","Java"));
  
  }
}*/


/*
class Main{
  public static void main(String[] args) {


String a = "helloWorld";
System.out.println(a.substring(0,4));
  
  }
}
*/



/*class Main{
  public static void main(String[] args) {


String a = "helloWorld";
System.out.println(a.toUpperCase()); //끝 위치는 포함하지않는다, 즉 ~미만
  
  }
}*/






/*
class Main {
  public static void  main(String[] args) {
    int a = 10;
    int b = 5;

    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
// 나머지 연산자 (홀수, 짝수, 배수)
    System.out.println(a%b);
    System.out.println(7%2);  //홀수 1
    System.out.println(6%2);  //짝수 0
    System.out.println(6%3);  //배수 나눈수의 배수  0
    System.out.println(24%5);
  }

}
*/














/*
//클래스 선언
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); // hello world를 출력
}*/