package day03;

public class Ex02 {
	public static void main(String[] args) {
	/*
	 사칙연산 
	 +, -, /, *, % 
	 /: 정수/정수 => 정수
	  -> 실수 결과를 원한다면 연산값들 중 하나라도 실수값 있어야함(float 실수)
	  %(mod):모든 연산  정수 %정수 => 나머지 값
	 */
	int num1 =10, num2=3;
	System.out.println(num1 /num2);// 몫만 남는다
	System.out.println(num1 /(float)num2 );//실수 값도 나타난다
	System.out.println(num1 % num2);//나머지 값만 나온다
	 /*
	a =  10;
	a+=10; => a= a+10
	a*=10; => a= a*10  
	  
	 */
	int su1=5,su2=5;
	su1+=1;//su1(6) =su1(5)+1
	System.out.println(su1);
	su1-=1;//su1(5)= su1(6)-1
	System.out.println(su1);
	su1*=su2;//su1(25) =su1(5)*(5)su2
	System.out.println(su1);
	su1/=su2;// su1(5) =su1(25) /(5)su2
	System.out.println(su1);
	su1%=su2;// su1(0) =su1(5)%(5)su2
	System.out.println(su1);
	
	/*
	 관계연산자
	 <,> <= , >=, ==(앞 뒤 연산자가 같냐 표현)
	 결과적으로 참(true) 또는 거짓(false)표현\
	 10 <20 => true , 10>20 = fales
	 */
		double do01 = 3.0, do02 =3.1;
		System.out.println(do01 >=do02);
		System.out.println(do01<=do02);
		System.out.println(do01==do02);
		//!= 두 값이 가지 않냐
		System.out.println(do01 != do02);
		/*
		 논리 연산자
		 참 또는 거짓을 표현
		 앞에 있는 값과 뒤에 있는 값을 연산(값 || 값 =>) 
		 ||(or) : 값들 중 하나라도 참이면 결과는 참이다(true)
		 &&(and): 하나라도 거짓이면 거짓(false)
		 | : 반전. !참 => 거짓으로 변경 . !거짓 => 참 (true)
		 
		 */
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		
		
		System.out.println(false&&false);
		System.out.println(false&&true);
		System.out.println(true&&false);
		System.out.println(true&&true);
		
		System.out.println("!true :"+ !true);
		System.out.println("!false:"+ !false );
		//!는 반전 시켜 준다 
		
		
		//%:범위 구할때. 또는 짝,홀,배수 
		//예)11을 2로 나눈다 몫은 5가되고 1이 남는다
		su1 =10;
		// boolean: true false 저장 가능하다
		boolean bool;
		int result=su1 % 2;
		
		System.out.println("result :"+result);
		bool = result==0;
		
		System.out.println("true면 짝수 :"+bool);
		System.out.println("false면 홀수 :"+bool);
		
		System.out.println(su1%2 == 0);
		System.out.println((su1%2 == 0)&&(su1>5));
		//짝수 이면서 5보다 크다는걸 알수 있다
	
		su1=9;
		System.out.println((su1%2 == 0)||(su1>5));
		//짝수 이거나 5보다 크다는걸 알수 있다
		
		/*
		 증감 연산자 
		 자기 자신을 1증가 또는 감소 시킨다
		 a= 10
		 a++,++a  자기자신을 증가 ,--a,a-- 자기자신을 감소 
		 =>a=a+1, a=a-1
		 */
		
		su1= 10;
		su2 =++su1;
		System.out.println("su1 :"+su1);
		System.out.println("su1 :"+su2);
		//앞쪽에 부호 붙으면 먼저 연산자 보다 먼저 증가 시킨다
		su1= 10;
		su2 =su1++;
		System.out.println("su1 :"+su1);
		System.out.println("su1 :"+su2);
		// 뒤쪽에 부호가 있으면 연산자보다  나중에 증가 시킨다
		
		
		// 조건 연산자 (참고 )
		su1=8;
		String s= (su1%2 == 0)?"짝수":"홀수";
		System.out.println(s);
		
		 
	}

}
