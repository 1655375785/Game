package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	Person  person=new Person();
	Computer computer=new Computer();
    private int total;
	
//	person.inputName();
	
	Scanner input=new Scanner(System.in);
	public void startGame(){
		System.out.println("*****************");
		System.out.println("   ** ��ȭ����ʼ **");
		System.out.println("*****************");
		System.out.println("��ȭ����1.����2.ʯͷ3.��");
	}
	public void askName(){
	
		System.out.println("��ѡ��Է���ɫ������1.����2.�ܲ�3.��Ȩ����");
		computer.inputName();
		System.out.println("���������������");
		person.inputName();
		System.out.println(person.getPlayName()+" VS "+computer.getPlayName()+" ��ս");
	}
	public void playGame(){
		System.out.println("Ҫ��ʼô��y/n����");
		String yn;
		yn=input.next();
		int b=computer.myFist();
		while(yn.equals("y")){
			System.out.println("���ȭ��1.����2.ʯͷ3.������������Ӧ����");
			int a=person.myFist();
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
			int c=Math.abs(a-b);
			switch (c) {
			case 0:
				System.out.println("����ƽ�֣�");
				break;
            case 1:
            	if (a>b) {
					System.out.println("���˵����Ӯ�ˣ����");
					person.setWinningTimes(person.getWinningTimes()+1);
				}
            	else{
            		System.out.println("���˵�������ˣ��汿");
            		computer.setWinningTimes(computer.getWinningTimes()+1);
            	}
				break;
            case 2:
            	if (a>b) {
            		System.out.println("���˵�������ˣ��汿");
            		person.setWinningTimes(person.getWinningTimes()+1);
				}else{
					System.out.println("���˵����Ӯ�ˣ����");
					person.setWinningTimes(person.getWinningTimes()+1);
				}
	
	            break;

			default:
				break;
			}
			System.out.println("�Ƿ�ʼ��һ��y/n��");
			yn=input.next();
			total++;
		}
		
		
	}
	public int finalResult(int result){
		return result;
	}
	
}
