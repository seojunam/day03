package day03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str;
		
		
		System.out.print("값 입력 : ");
		str= input.next();
		System.out.println( str );
		
		System.out.println("값 입력 : ");
		
		input.nextLine();
		
		str= input.nextLine();
		
		
		System.out.println( "출력 결과 :"+str );
		
		System.out.println("다음 문장들 실행 !!");
	}

}
