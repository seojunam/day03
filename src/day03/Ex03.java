package day03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		 Scanner input =new Scanner(System.in);
		
		 //수를 입력 받아 / 짝,홀수를 구분하여 / 출력하시오
		 int str;
		System.out.print("수입력 :");
		str= input.nextInt();
		
		
		String s= (str%2 == 0)?"짝수":"홀수";
		System.out.println(str+"="+s);
		
		
		
		
		s=(str%3==0)?"3의배수" :" 3배수가 아니다";
		System.out.println(str+"="+s);
		
		System.out.println("두수 입력:");
	 int rum1=input.nextInt();
	 int rum2=input.nextInt();
	 s=(rum1>rum2)?"rum1은 rum2보다 작다":
		 "rum2가 rum1 보다 크다";
	 System.out.println("rum1:"+rum1+"rum2:"+rum2);
	 System.out.println(s);
		
		
		
		
		
		
	
	   
	   
	
		 
		 
	}

}
