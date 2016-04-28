package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public  class Computer extends Player{
	public void  inputName(){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		switch (num) {
		case 1:
			setPlayName("Áõ±¸");
			break;
		case 2:
			setPlayName("²Ü²Ù");
			break;
		case 3:
			setPlayName("ËïÈ¨");
			break;
		default:
			System.out.println("ÊäÈë´íÎó£¡");
			break;
		}
	}
	public int myFist(){
		int b=(int) (Math.random()*3+1);
	return b;	
	}

}
