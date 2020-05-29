package mediator;

/**
 * 具体的同事类-TV类
 */
public class TV extends Colleague {
	public TV(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {//调用中介者的方法传递自己
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	//自己的方法
	public void StartTv() {
		System.out.println("It's time to StartTv!");
	}

	public void StopTv() {
		System.out.println("StopTv!");
	}
}
