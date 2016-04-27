package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	protected String playName;
	public void  inputName(){              //玩家名字方法重写
		Scanner input=new Scanner(System.in);
		playName=input.next(); 
	}
	public int myFist(int number){
		number=input.nextInt();
	    return number;	
	}
}
