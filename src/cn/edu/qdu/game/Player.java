package cn.edu.qdu.game;

import java.util.Scanner;

public  abstract class Player {
	private String playName;
	private int winningTimes;
	Scanner input=new Scanner(System.in);
	public abstract void  inputName();{
		String playName=input.next();
	}
	public Player(){
		setWinningTimes(0);
	}
	
	public abstract int myFist();
	
	public String getPlayName() {
		return playName;
	}
	
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	
	public int getWinningTimes() {
		return winningTimes;
	}
	
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
	
}
