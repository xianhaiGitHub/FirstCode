package com.bank.day01;

import java.util.Scanner;

import com.duixian.day01.VertifyCode;
/**
 *  ע���¼������
 * @author zhaoxianhai
 *
 */
public class RegistAndLogin {
	// �½��������ڴ洢�û���Ϣ
	String[] username = new String[10];
	String[] password = new String[10];
	VertifyCode v = new VertifyCode();//������֤��
	BankSystem bankSystem = new BankSystem();
	Scanner input = new Scanner(System.in);
	 int index = -1;
	public void init(){
		System.out.println("=================���й���ϵͳ=========================");
		System.out.println("\t\t1.ע��");
		System.out.println("\t\t2.��½");
		System.out.println("�����������");
		int choice = input.nextInt();
		switch (choice) {
		case 1:
			regist();
			break;
		case 2:
			login();
			break;
		default:
			System.out.println("�������");
			break;
		}
	}
	/*
	 * ��½
	 * 
	 */
	public void login() {
		System.out.println("�������û���:");
		String userName = input.next();
		System.out.println("�������½����:");
		String passWord = input.next();
		for(int i = 0; i<username.length;i++ ){
			if(username[i] != null){
				if(username[i].equals(userName) && password[i].equals(passWord)){
					System.out.println("��ϲ����½�ɹ�~");//��Ҫ�ظ���ʾ����ϵͳ�������//
					while(true){
						bankSystem.bankinit();
					}
				}		
			}else{
				continue;
			}
		}
	}
	/*
	 * ע��
	 * 
	 */
	public void regist() {
		while(true){
			index++;
			System.out.println("�������û���:");
			String name = input.next();
			if(name.length() >=11){
				if(!name.endsWith("qq.com")){
					System.out.println("������������ʽ����ȷ");
					index--;
				}else{
					username[index] = name;
					break;
				}
			}else{
				System.out.println("�û������ܵ���11λ");
				index--;
			}
		}
		while(true){
			System.out.println("�����õ�¼����");
			String pwd = input.next();
			if(pwd.length() >= 6){
				password[index] = pwd;
				break;
			}else{
				System.out.println("�����������λ��С��6λ,����������");
			}
		}
		while(true){
			String vCode=v.vertifyCode();
			System.out.println(vCode);//������֤��
			System.out.println("��������֤��");
			String code = input.next();
			if(code.equalsIgnoreCase(vCode)){
				System.out.println("��ϲ��ע��ɹ�,��ȥ��½��~");
				break;
			}else{
				System.out.println("��֤�����,����������");
			}
		}
		for(int i = 0;i<username.length;i++){
			System.out.println(username[i] + "\t" +password[i]);
		}
	}
}
