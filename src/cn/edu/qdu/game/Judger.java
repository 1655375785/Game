package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	Scanner input=new Scanner(System.in);
	public void startGame(){
		System.out.println("\t\t\t\t*****************");
		System.out.println("\t\t\t\t** ��ȭ����ʼ **");
		System.out.println("\t\t\t\t*****************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}
	public void askName(){
		int computerName,number1;
		System.out.println("��ѡ��Է���ɫ������1.����2.�ܲ�3.��Ȩ����");
		number1=input.nextInt();
		System.out.println("���������������");
		
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
