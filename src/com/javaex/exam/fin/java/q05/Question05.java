package com.javaex.exam.fin.java.q05;

public class Question05 {
	private int scores[];
	
	public Question05(int scores[]) {
		this.scores = scores;
	}
	
	public int getTotal() {
		int total = 0;
		//	TODO: 여기에 로직 코드를 작성합니다
		for(int a : scores) {
			if(!(a > 100 || a < 0)) 
				total += a;
		}
		return total;
	}
	
	public double getAverage() {
		int total = 0, count = 0;
		
		for(int a : scores) {
		    if(!(a > 100 || a < 0)) 
		    	total += a;
		}
		
		count = scores.length;
		return total / count;
	}
}
