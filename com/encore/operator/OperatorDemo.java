package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {
	
	public OperatorDemo() {
	}
	
	// example01
	// 반환값X, 매개변수X
	
	public void example01() {
		System.out.println(">>>> 산술연산")		;
		int	x	= 100, y	= 100, result	= 0	;
		System.out.println(" + " + (x + y))		;
		System.out.println(" - " + (x - y))		;
		System.out.println(" * " + (x * y))		;
		System.out.println(" / " + (x / y))		;
		System.out.println(" % " + (x % y))		;
	}
	
	public String example02(String color01, String color02) {
		System.out.println(">>>> 연결연산")	;
		
		return "신호등의 색깔은 " + color01 + "과 " + color02 + "입니다.";
	}
	
	public void example03() {
		System.out.println(">>>> 논리연산")	;
		boolean	isFlag	= false;
		System.out.println("논리 부정, " + !isFlag);
		
		// Scanner 부터 입력받은 숫자가 짝수인지 아닌지를 판단해보고 싶다면?
		Scanner scan 	= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ")		;
		int		number	= scan.nextInt()		;
		System.out.println("Result >>>> 짝수\t\t : " + (number%2==0))	;
		System.out.println("Result >>>> 홀수\t\t : " + (number%2!=0))	;
		
		// Scanner 부터 입력받은 숫자가 3의 배수인지를 판단해보고 싶다면?
		System.out.println("Result >>>> 3의배수\t : " + (number%3==0));
		
		// Scanner 부터 입력받은 숫자가 양수인지 아닌지를 판단해보고 싶다면?
		System.out.println("Result >>>> 양수\t\t : " + (number>=0))	;
	}
	
	public void example04() {
		System.out.println(">>>> 증감연산, ++, --")	;
		int		age		= 26;
		System.out.println("현재 나이는 = " + age)		;
		System.out.println(++age);	// age 현재값에 +1해서 이를 다시 age 에 담는 것.
		System.out.println("현재 나이는 = " + age)		;
		System.out.println(age++);	// 후위 연산은 연산을 후에 하는 것. 먼저 print 를 하고 난 후 age 에 age+1을 하게 된다.
		System.out.println("현재 나이는 = " + age)		;
		
		System.out.println();
		int		number	= 20;
		int		result	= ++number*3;
		System.out.println("Result >>>> " + result)	;
		System.out.println("number >>>> " + number)	;
	}
	
	public void example05() {
		System.out.println(">>>> 논리연산");
		/*
		 * &(이면서, 이고), |(이거나), (&&, ||) - short shortcut
		 */
		
		Scanner scan 	= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ")		;
		int		number	= scan.nextInt()		;			
		
		// Scanner 로부터 입력받은 숫자가 1~100 사이값인지 판단하고 싶다면?			// 기능적으로 &&가 우수.
		System.out.println("1 ~ 100 " + (number >= 1 && number <=100));	// &&를 사용하는 이유 : 앞에서 False 가 나오면 뒤 조건은 보지 않는다.
		
	}
	
	public void example06() {
		System.out.println(">>>> 일반논리연산")		;
		Scanner scan 	= new Scanner(System.in);
		System.out.print("문자를 입력하세요 : ")		;
		
		char	str		= scan.next().charAt(0)	;	// 입력된 문자열(String) 중, 1번째 문자(char)만 입력됨.
		
		// Scanner 부터 입력받은 문자가 A~Z 사이 대문자인지 판단하고 싶다면?
		System.out.println("input char , " + (str))				;
		System.out.println("A ~ Z " + (str>='A' && str<='Z'))	;	// String 은 비교가 불가능하나, char 는 비교 가능.
	}
	
	public void example07() {
		System.out.println(">>>> 삼항연산")		;
		// (조건식) ? true 일 경우: false 일 경우 or [false 일 경우의 조건식] true 일 경우: false 일 경우;
		Scanner scan 	= new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ")		;
		int		number	= scan.nextInt()		;
		
		// 스캐너로부터 입력받은 숫자가 양수인지, 음수인지 아니면 0인지 판단하고 싶다면?
		String	result	= ( number > 0 ) ? "양수" : ( number == 0 ) ? "0" : "음수";
		System.out.println("Result >>>> " + result)	;
	}
}
