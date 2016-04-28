package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
    private Person person=new Person() ;
	private Computer computer = new Computer();
	private int total = 0;

	// person.inputName();

	Scanner input = new Scanner(System.in);

	// 开始游戏
	public void startGame() {
		System.out.println("*****************");
		System.out.println("   ** 猜拳，开始 **");
		System.out.println("*****************");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
	}

	// 询问名字
	public String askName() {

		System.out.println("请选择对方角色姓名（1.刘备2.曹操3.孙权）：");
		computer.inputName();
		System.out.println("请输入你的姓名：");
		person.inputName();
		System.out.println(person.getPlayName() + " VS " + computer.getPlayName() + " 对战");
		return null;
	}

	// 进行游戏
	public void playGame() {
		System.out.println("要开始么（y/n）？");
		String yn;

		yn = input.next();
		int b = computer.myFist();
		while (yn.equals("y")) {
			System.out.println("请出拳：1.剪刀2.石头3.布（）输入相应数字");
			int a = person.myFist();
			switch (a) {
			case 1:
				System.out.println("你出拳：剪刀");
				break;
			case 2:
				System.out.println("你出拳：石头");
				break;
			case 3:
				System.out.println("你出拳：布");
				break;

			default:
				System.out.println("输入错误！");
				break;
			}
			int c = Math.abs(a - b);
			// int ping=0;
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("比赛平局！");
				// ping++;
				break;
			case 1:
				if (a > b) {
					System.out.println("结果说：你赢了！真棒");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("结果说：你输了！真笨");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
				break;
			case 2:
				if (a > b) {
					System.out.println("结果说：你输了！真笨");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("结果说：你赢了！真棒");
					person.setWinningTimes(person.getWinningTimes() + 1);
				}
				break;

			default:
				System.out.println("输入错误，请重新输入！");
				break;
			}
			System.out.println("是否开始下一轮y/n：");
			yn = input.next();
			total++;
		}

	}

	// 输出结果
	public int finalResult() {
		System.out.println(computer.getPlayName() + " VS " + person.getPlayName());
		System.out.println("对战局数：" + total);
		System.out.println("姓名" + "\t得分");
		System.out.println(computer.getPlayName() + ": " + computer.getWinningTimes());
		System.out.println(person.getPlayName() + ": " + person.getWinningTimes());
		if (person.getWinningTimes() > computer.getWinningTimes()) {
			System.out.println("不错呀，你赢了！");
		} else {
			System.out.println("呵呵，笨笨，下次努力哦！");
		}
		return 0;
	}
}