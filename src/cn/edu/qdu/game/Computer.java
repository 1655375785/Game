package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public  class Computer extends Player{
	public void  inputName(){
		Scanner input=new Scanner(System.in);
		int i=input.nextInt();
		String[] name={"Áõ±¸"+"²Ü²Ù"+"ËïÈ¨"};
		setPlayName(name[i-1]);
	}
	public int myFist(){
		int q=(int) ((Math.random()*3)+1);
	return q;	
	}

}
