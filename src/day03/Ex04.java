package day03;

import java.util.Scanner;

public class Ex04 {
 public static void main(String[] args) {
	 /*
	  제어문
	  프로그램의 흐름을 변경 할 수 있다.
	  if ,switch,for, while,do while,break, continue
	  lf(조건식){
	 (종속문장) 해당 조건이 참여면 중괄호 내용이 실행
	  }
	  if문 종료후 다음 문장들 실해
	  
	  */
	Scanner input =new Scanner(System.in);
	int run;
	/*
	System.out.println("1.쉬운게임");
	System.out.println("2.어려운 게임");
	System.out.println("3.종료");
	System.out.println(">>> :");
	run =input.nextInt();
	if(run ==1) {
		System.out.println("1.쉬운게임 시작");
	}
	if(run==2) {
		System.out.println("2.어려운 게임 시작");
	}
	if(run==3) {
		System.out.println("3.게임 종료");
	}
	System.out.println("다음 문장 실행")
	;*/
	
	System.out.print(" 수입력:");
	run =input.nextInt();
	if(run>10) 
		{
		System.out.println("run 10보다 크다");
	System.out.println("1run 10보다 크다");
	System.out.println("2run 10보다 크다");
	System.out.println("3run 10보다 크다");
	}
	
		System.out.println("다음 문장실행!!!");
		
		System.out.print("수 입력 :");
		run =input.nextInt();
		if(run%2 ==0) {
			System.out.println("입력 값 짝수:"+run);
		}
		if(run%2 !=0) {
			System.out.println("입력 값 홀수: "+run);
		}
		System.out.println("다음 문장실행!!!");
		
	}
 }


