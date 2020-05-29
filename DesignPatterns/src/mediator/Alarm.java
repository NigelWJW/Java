package mediator;

/**
 * 具体的同事类-闹钟类
 */
public class Alarm extends Colleague {
	//构造器
	public Alarm(Mediator mediator, String name) {
		super(mediator, name);
		//在创建Alarm 同事对象时，将自己放入到ConcreteMediator 对象中[集合]
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		//调用的中介者对象的getMessage
		this.GetMediator().GetMessage(stateChange, this.name);//调用中介者的消息获取标识
	}

	//自己的方法
	public void SendAlarm(int stateChange) {
		SendMessage(stateChange);//发送标识
	}
}
