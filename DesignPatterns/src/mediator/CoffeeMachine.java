package mediator;

/**
 * �����ͬ����-���Ȼ���
 */
public class CoffeeMachine extends Colleague {
	public CoffeeMachine(Mediator mediator, String name) {
		super(mediator, name);
		mediator.Register(name, this);
	}

	@Override
	public void SendMessage(int stateChange) {
		this.GetMediator().GetMessage(stateChange, this.name);
	}

	//�Լ��ķ���
	public void StartCoffee() {
		System.out.println("It's time to startcoffee!");
	}

	public void FinishCoffee() {
		System.out.println("After 5 minutes!");
		System.out.println("Coffee is ok!");
		SendMessage(0);
	}
}
