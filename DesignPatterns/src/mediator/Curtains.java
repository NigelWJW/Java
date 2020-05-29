package mediator;

/**
 * 具体的同事类-窗帘类
 */
public class Curtains extends Colleague {
	public Curtains(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	//自己的方法
	public void UpCurtains() {
		System.out.println("I am holding Up Curtains!");
	}
}
