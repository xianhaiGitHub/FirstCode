package com.duixian.day01;

public class TestCalc {
	public static void main(String[] args) {
		Calc calc =  new Calc();
	/*	calc.a = 12;
		calc.b = 13;
		int x1 = calc.plus();
		int x2 =calc.jian();
		int x3 =calc.modify();
		int x4 =calc.chu();
		System.out.println("��Ϊ��"+x1+"��Ϊ��"+x2+"��Ϊ��"+x3+"��Ϊ��"+x4);
		*/
		double x1 = calc.calcolate(3, 4, "+");
		double x2 = calc.calcolate(3, 4, "-");
		double x3 = calc.calcolate(3, 4, "*");
		double x4 = calc.calcolate(3, 4, "/");
		System.out.println("��Ϊ��"+x1+"\t"+"��Ϊ��"+x2+"\t"+"��Ϊ��"+x3+"\t"+"��Ϊ��"+x4);
	}
}
