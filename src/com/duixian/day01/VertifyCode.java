package com.duixian.day01;

public class VertifyCode {
	public String vertifyCode(){
		String s = "asdfghjklqwertyuiop";
		String vCode = "";// ������֤��
		for (int i = 0; i < 4; i++) {// �ĸ��ַ�
			int num = (int) (Math.random() * s.length());// ����ַ�λ��
			char c = s.charAt(num);// ȡ�ַ�
			vCode += c;// ƴ����֤���ַ�
		}
		return vCode;
	}
}
