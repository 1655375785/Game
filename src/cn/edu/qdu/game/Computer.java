package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public  class Computer extends Player{
	public void  inputName(){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch (num) {
		case 1:
			setPlayName("����");
			break;
		case 2:
			setPlayName("�ܲ�");
			break;
		case 3:
			setPlayName("��Ȩ");
			break;
		default:
			System.out.println("�������");
			break;
		}
	}
	public int myFist(){
		int b=(int) (Math.random()*3+1);
	return b;	
	}

}
