package com.duixian.day01;

public class TestDog {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
		dog.type = "̩��";
		dog.age = 10;
		dog.color = "��ɫ";
		dog.sex = "��";
		
		dog.eat();
		dog.sleep();
		dog.show();
	}
}
