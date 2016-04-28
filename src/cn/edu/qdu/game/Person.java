package cn.edu.qdu.game;

import java.util.Scanner;

public  class Person extends Player{
	protected String playName;
	public void  inputName(){              //ÊäÈëÍæ¼ÒÃû×Ö
		Scanner input=new Scanner(System.in);
	String 	name=input.nextLine();
	setPlayName(name);
	}
	public int myFist(){
		int number=input.nextInt();
	    return number;	
	}
	
}
