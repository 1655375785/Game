package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	Scanner input=new Scanner(System.in);
	public void startGame(){
		System.out.println("\t\t\t\t*****************");
		System.out.println("\t\t\t\t** 猜拳，开始 **");
		System.out.println("\t\t\t\t*****************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}
	public void askName(){
		int computerName,number1;
		System.out.println("请选择对方角色姓名（1.刘备2.曹操3.孙权）：");
		number1=input.nextInt();
		System.out.println("请输入你的姓名：");
		
		switch (number1) {
		case 1:
			System.out.println(palyName+"");
			break;

		default:
			break;
		}
	}
	public void playGame(){
		
	}
	public int finalResult(int result){
		return result;
	}
	public static void main(String[] args) {
		Person person=new Person();
		Computer computer=new Computer();
//		private int total;
		
		person.inputName();
	}

}
