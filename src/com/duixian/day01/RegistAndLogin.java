package com.duixian.day01;

import java.util.Scanner;

public class RegistAndLogin {
	// �½��������ڴ洢�û���Ϣ
	String[] username = new String[10];
	String[] password = new String[10];
	
	
	Scanner input = new Scanner(System.in);
	static VertifyCode VertifyCode = new VertifyCode();
	static int index = -1;

	/*public static void main(String[] args) {
		RegistAndLogin registandlogin = new RegistAndLogin();
		while (true) {
			registandlogin.init();//
		}
	}
	*/
	/**
	 * ������
	 */
	public  void init() {
		System.out.println("\t1.ע��");
		System.out.println("\t2.��½");
		System.out.println("���������");
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

	/**
	 * ע��
	 */
	public  void regist() {
		while (true) {
			index++;// ////
			System.out.println("�������û���:");
			String name = input.next();
			if (name.length() >= 16) {
				if (!name.endsWith("@qq.com")) {
					System.out.println("��������ȷ�������ʽ");
				} else {
					username[index] = name;// ///////////
					while (true) {
						System.out.println("����������:");
						String pswd = input.next();
						if (pswd.length() < 6) {
							System.out.println("�����������С��6Ϊ,����������");
						} else {
							password[index] = pswd;
							
							String vCode = VertifyCode.vertifyCode();
							System.out.println(vCode);
							System.out.println("��������֤��");
							String yzm = input.next();
							if (yzm.equalsIgnoreCase(vCode)) {
								// ///////////////////////////////////////
								System.out.println("��ϲ��ע��ɹ�,���½");
								break;
							} else {
								System.out.println("��֤���������������");
							}
						}// ��ʽ��ȷ
					}
					for(int i = 0; i<username.length;i++){
						System.out.println(username[i]+"\t"+password[i]);
					}
				}
				break;
			} else {
				System.out.println("�û�������16λ");
			}
		}
	}

	/**
	 * ��½
	 */
	public  void login() {
		System.out.println("�������û���:");
		String userName = input.next();
		System.out.println("����������:");
		String passWord = input.next();
		for (int i = 0; i < username.length; i++) {
			if(username[i] != null){
				if (username[i].equals(userName) && password[i].equals(passWord)) {
					System.out.println("��½�ɹ�");//������
/*				while(true){
						booksystem.bookInit();
					}*/
					
				} else {
					continue;
				}
			}
		}
	}

}
