package command;

/**
 * 调用类，命令模式-将请求对象和执行对象解耦，调用者只需调用命令对象的方法即可让接受者工作，命令作为桥梁的作用
 * 容易设计一个命令队列，可以多线程的执行命令，容易实现请求的撤销和重做。但是可能导致系统有过多的具体命令类，增加复杂度
 * 空命令也很重要省去了判空 的操作，不然每次按键都要判空，应用于CMD命令订单，触发反馈
 * Spring的Jdbc Template就是使用了命令模式，StatementCallback接口类似命令抽象接口，QueryStatementCallback实现
 * 命令也是命令的接收者，命令的调用者是Jdbc Template，其中的execute方法调用action.doInStatement方法对用不同的对象
 * 实现不用的逻辑
 */
public class Client {
	public static void main(String[] args) {
		//使用命令设计模式，完成通过遥控器，对电灯的操作
		//创建电灯的对象(接受者)
		LightReceiver lightReceiver = new LightReceiver();
		//创建电灯相关的开关命令
		LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
		LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
		//需要一个遥控器
		RemoteController remoteController = new RemoteController();
		//给我们的遥控器设置命令, 比如 no = 0 是电灯的开和关的操作
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println("--------按下灯的开按钮-----------");
		remoteController.onButtonWasPushed(0);
		System.out.println("--------按下灯的关按钮-----------");
		remoteController.offButtonWasPushed(0);
		System.out.println("--------按下撤销按钮-----------");
		remoteController.undoButtonWasPushed();


		System.out.println("=========使用遥控器操作电视机==========");
		TVReceiver tvReceiver = new TVReceiver();
		TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
		TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);
		//给我们的遥控器设置命令, 比如 no = 1 是电视机的开和关的操作
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		System.out.println("--------按下电视机的开按钮-----------");
		remoteController.onButtonWasPushed(1);
		System.out.println("--------按下电视机的关按钮-----------");
		remoteController.offButtonWasPushed(1);
		System.out.println("--------按下撤销按钮-----------");
		remoteController.undoButtonWasPushed();
	}
}
