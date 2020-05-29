package mediator;

import java.util.HashMap;

/**
 * 具体的中介者类
 */
public class ConcreteMediator extends Mediator {
	//集合，放入所有的同事对象
	private HashMap<String, Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {//初始化
		colleagueMap = new HashMap<String, Colleague>();
		interMap = new HashMap<String, String>();
	}

	//注册同事方法
	@Override
	public void Register(String colleagueName, Colleague colleague) {
		colleagueMap.put(colleagueName, colleague);//加入同事名-同事集合
		if (colleague instanceof Alarm) {//加入同事类型名-同事名集合
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof Curtains) {
			interMap.put("Curtains", colleagueName);
		}
	}

	//具体中介者的核心方法
	//1. 根据得到消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		//处理闹钟发出的消息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {//闹钟类型的发消息
			if (stateChange == 0) {//标识是0的情况下开始煮咖啡和打开电视
				((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).StartCoffee();//根据类型名先获取同事名，再获取同事
				((TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {//标识是1就关闭电视
				((TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}
		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {//咖啡机类型发消息
			((Curtains) (colleagueMap.get(interMap.get("Curtains")))).UpCurtains();//将窗帘拉起来
		} else if (colleagueMap.get(colleagueName) instanceof TV) {//如果TV发消息
			//处理TV消息，处理
		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {//窗帘发消息
			//如果是以窗帘发出的消息，这里处理...
		}
	}

	@Override
	public void SendMessage() {
	}
}
