package com.bank.day01;

import java.util.Scanner;
/**
 * �������п�,ȡǮ�ʹ�Ǯ
 * @author zhaoxianhai
 *
 */
public class BankSystem {
	/*
	 * ������
	 */
	String[] userName = new String[20];
	String[] bankId = new String[20];
	double[] money = new double[20];
	int index = -1;
	CardId cd = new CardId();
	Scanner input =  new Scanner(System.in);
	public void bankinit(){
		System.out.println("\t1.�������п�");
		System.out.println("\t2.��Ǯ:");
		System.out.println("\t3.ȡǮ");
		System.out.println("������ѡ��:");
		int choice = input.nextInt();
		switch(choice){
		case 1:
			add();
			break;
		case 2:
			saveMoney();
			break;
		case 3:
			qumoney();
			break;
		default :
			System.out.println("�Բ���,�������");
			break;
		}
	} 
	public void qumoney() {
		System.out.println("���������п���:");
		String card = input.next();
		if(bankId[index].equals(card)){
			System.out.println("������ȡ����:");
			double money1 = input.nextDouble();
			money[index] -= money1;
			System.out.println("�������Ϊ:"+money[index]);
		}else{
			System.out.println("������ĵĿ��Ŵ�������������");
		}
	}
	/*
	 * ��Ǯ
	 */
	public void saveMoney() {
		System.out.println("���������п���:");
		String card = input.next();
		if(bankId[index].equals(card)){
			System.out.println("����������:");
			double money2 = input.nextDouble();
			money[index] += money2;
			System.out.println("�������Ϊ:"+money[index]);
		}else{
			System.out.println("������ĵĿ�����,����������");
		}
	
		
	}
	/*
	 *�������п�
	 */
	public void add(){
		String choice;
		do{
			index++;
			System.out.println("����������:");
			userName[index] = input.next();
			String x =cd.cardid();//����������п�
			System.out.println("���Ŀ���Ϊ:"+x);
			//System.out.println(x);
			bankId[index] = x;
			System.out.println("��������:");
			money[index] = input.nextDouble();
			System.out.println("�Ƿ��������(Y/N)");
			choice = input.next();//
		}while(choice.equalsIgnoreCase("Y/N"));
		for(int i = 0;i<userName.length;i++){
			System.out.println(userName[i]+"\t"+bankId[i]+"\t"+money[i]);
		}
	}
}
