package com.duixian.day01;

import java.util.Scanner;

public class BookSystem {
	String[] bookName = new String[1024];
	String[] bookAuthor = new String[1024];
	double[] bookPress = new double[1024];
	int index = -1;
	Scanner input =  new Scanner(System.in);
	/*
	 * ��ʼ������
	 */
	public void bookInit(){
		System.out.println("========ͼ�����ϵͳ===========");
		System.out.println("\t1.���ͼ����Ϣ");
		System.out.println("\t2.ɾ������Ϣ");
		System.out.println("\t3.�޸�ͼ����Ϣ");
		System.out.println("\t4.��ѯ����ͼ����Ϣ");
		System.out.println("\t5.ģ����ѯͼ����Ϣ");
		System.out.println("\t6.�˳�ϵͳ");
		System.out.println("\t���������:");
		int choice = input.nextInt();
		switch(choice){
		case 1:
			add();
			break;
		case 2:
			delete();
			break;
		case 3:
			update();
			break;
		case 4:
			showAll();
			break;
		case 5:
			showByCondition();
			break;
		case 6:
			break;
		default :
			System.out.println("�������");
			break;
		}
	}
	/*
	 * ���ͼ����Ϣ
	 */
	public void add(){
		String choice;//�����Ƿ������ӵ��ַ�
		do{
			index++;
			System.out.println("������ͼ������");
			bookName[index] = input.next();
			System.out.println("������ͼ������");
			bookAuthor[index] = input.next();
			System.out.println("������ͼ��۸�");
			bookPress[index] = input.nextDouble();
			System.out.println("�Ƿ�������(Y/N)");
			choice = input.next();
		}while(choice.equalsIgnoreCase("Y"));
	}
	/*
	 * ɾ������Ϣ
	 */
	public void delete(){
		System.out.println("��������Ҫɾ����ͼ������");
		int id = input.nextInt();
		bookName[id-1] = null;
		bookAuthor[id-1] = null;
		bookPress[id-1] = 0.0;
	}
	/*
	 * �޸�ͼ����Ϣ
	 */
	public void update(){
		showAll();
		System.out.println("��������Ҫɾ����ͼ������");
		int id = input.nextInt();
		System.out.println("������ͼ������");
		bookName[id-1] = input.next();
		System.out.println("������ͼ������");
		bookAuthor[id-1] = input.next();
		System.out.println("������ͼ��۸�");
		bookPress[id-1] = input.nextDouble();
	}
	/*
	 * ��ѯ����ͼ����Ϣ
	 */
	public void showAll(){
		System.out.println("���\tͼ������\tͼ������\tͼ��۸�");
		for(int i = 0; i<bookName.length;i++){
			if(bookName[i]!=null){
				System.out.println((i+1)+"\t" +bookName[i]+"\t"+bookAuthor[i]+"\t"+bookPress[i]);
			}else{
				continue;
			}
		}
	}
	/*
	 * ģ����ѯ
	 */
	public void showByCondition(){
		System.out.println("��������������");
		String s = input.next();
		System.out.println("���\tͼ������\tͼ������\tͼ��۸�");
		for(int i = 0;i<bookName.length;i++){
			if(bookName[i] != null){	
				if(bookName[i].contains(s)){
					System.out.println((i+1)+"\t" +bookName[i]+"\t"+bookAuthor[i]+"\t"+bookPress[i]);
				}
			}else{
				continue;
			}
		}
	}
	//////////////////
	
}
