package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
    private Person person=new Person() ;
	private Computer computer = new Computer();
	private int total = 0;

	// person.inputName();

	Scanner input = new Scanner(System.in);

	// ��ʼ��Ϸ
	public void startGame() {
		System.out.println("*****************");
		System.out.println("   ** ��ȭ����ʼ **");
		System.out.println("*****************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}

	// ѯ������
	public String askName() {

		System.out.println("��ѡ��Է���ɫ������1.����2.�ܲ�3.��Ȩ����");
		computer.inputName();
		System.out.println("���������������");
		person.inputName();
		System.out.println(person.getPlayName() + " VS " + computer.getPlayName() + " ��ս");
		return null;
	}

	// ������Ϸ
	public void playGame() {
		System.out.println("Ҫ��ʼô��y/n����");
		String yn;

		yn = input.next();
		int b = computer.myFist();
		while (yn.equals("y")) {
			System.out.println("���ȭ��1.����2.ʯͷ3.������������Ӧ����");
			int a = person.myFist();
			switch (a) {
			case 1:
				System.out.println("���ȭ������");
				break;
			case 2:
				System.out.println("���ȭ��ʯͷ");
				break;
			case 3:
				System.out.println("���ȭ����");
				break;

			default:
				System.out.println("�������");
				break;
			}
			int c = Math.abs(a - b);
			// int ping=0;
			switch (Math.abs(a - b)) {
			case 0:
				System.out.println("����ƽ�֣�");
				// ping++;
				break;
			case 1:
				if (a > b) {
					System.out.println("���˵����Ӯ�ˣ����");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("���˵�������ˣ��汿");
					computer.setWinningTimes(computer.getWinningTimes() + 1);
				}
				break;
			case 2:
				if (a > b) {
					System.out.println("���˵�������ˣ��汿");
					person.setWinningTimes(person.getWinningTimes() + 1);
				} else {
					System.out.println("���˵����Ӯ�ˣ����");
					person.setWinningTimes(person.getWinningTimes() + 1);
				}
				break;

			default:
				System.out.println("����������������룡");
				break;
			}
			System.out.println("�Ƿ�ʼ��һ��y/n��");
			yn = input.next();
			total++;
		}

	}

	// ������
	public int finalResult() {
		System.out.println(computer.getPlayName() + " VS " + person.getPlayName());
		System.out.println("��ս������" + total);
		System.out.println("����" + "\t�÷�");
		System.out.println(computer.getPlayName() + ": " + computer.getWinningTimes());
		System.out.println(person.getPlayName() + ": " + person.getWinningTimes());
		if (person.getWinningTimes() > computer.getWinningTimes()) {
			System.out.println("����ѽ����Ӯ�ˣ�");
		} else {
			System.out.println("�Ǻǣ��������´�Ŭ��Ŷ��");
		}
		return 0;
	}
}