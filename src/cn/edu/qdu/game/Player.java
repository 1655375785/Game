package cn.edu.qdu.game;

import java.util.Scanner;

public class  Player {
	private String playName;
	private int winningTimes;
	Scanner input=new Scanner(System.in);
	public void  inputName(){
		playName=input.next();
	}

	public int myFist(int number){
		number=input.nextInt();
	    return number;	
	}
	public String getPerson() {
		return playName;
	}
	public void setPerson(String person) {
		this.playName = person;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	

}
