package mediator;

/**
 * 中介者模式：用一个中介对象封装一系列对象交互，从而耦合松散，MVC的C就是中间人，耦合是网状，中介者改成星型解耦，减少依赖，解决了
 * 你中有我，我中有你。但是中间这承担了较多责任，不能出错
 */
public class Client {
	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();

		//创建Alarm 并且加入到ConcreteMediator 对象的HashMap
		Alarm alarm = new Alarm(mediator, "alarm");
		//创建了CoffeeMachine对象，并且加入到ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");
		//创建 Curtains,并且加入到ConcreteMediator 对象的HashMap
		Curtains curtains = new Curtains(mediator, "curtains");
		//创建TV,并且加入到ConcreteMediator 对象的HashMap
		TV tV = new TV(mediator, "TV");

		//让闹钟发出消息
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}
}
