package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	protected String playName;
	public void  inputName(){              //������ַ�����д
		Scanner input=new Scanner(System.in);
		playName=input.next(); 
	}
	public int myFist(int number){
		number=input.nextInt();
	    return number;	
	}
}
