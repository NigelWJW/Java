package memento.theory;

/**
 * 备忘录对象类保存记录内容
 */
public class Memento {
	private String state;

	//构造器
	public Memento(String state) {
		super();
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
