package cn.edu.qdu.game;

public class Test {public static void main(String[] args) {
	Judger j=new Judger();     //创建裁判对象
	j.startGame();            //调用开始游戏方法
	j.askName();              //调用询问姓名方法
	j.playGame();             //调用玩游戏方法
	j.finalResult();          //调用输出结果方法
}

}
