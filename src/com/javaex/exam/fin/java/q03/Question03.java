package com.javaex.exam.fin.java.q03;

import java.util.Scanner;

public class Question03 {
	public void printAnswer() {
		int num;
		Scanner scanner;
		
		System.out.println("정수를 입력하세요:");
			
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		scanner.close();
		
		//	TODO: 이곳에 코드를 작성합니다.
			for(int i = 1; i <= num; i++){
				if(num % i == 0) {
					System.out.printf("%d는 소수가 아닙니다.", num);
				}else if(!(num % i == 0) && (num % i == 0)) {
					System.out.printf("%d는 소수입니다.", num);
				}
			}
					
			
			

	}
}