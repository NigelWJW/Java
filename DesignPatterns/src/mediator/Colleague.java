package mediator;

//同事抽象类，让不同的同事分离
public abstract class Colleague {
	public String name;
	private Mediator mediator;//将中介者聚合进来，

	public Colleague(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
