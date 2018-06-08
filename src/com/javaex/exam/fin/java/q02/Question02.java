package com.javaex.exam.fin.java.q02;

public class Question02 {
	public int getAnswer(int toNum) {
		//	TODO: 이곳에 해답을 작성합니다.
		int sum = 0;
		for(int i = 0; i <= toNum; i++) {
			
			sum *= i;
		}
		
		return sum;
		
	}
}
