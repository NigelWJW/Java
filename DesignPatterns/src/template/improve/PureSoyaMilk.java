package template.improve;

/**
 * 纯豆浆，即重写父类钩子方法，抽象方法空实现
 */
public class PureSoyaMilk extends SoyaMilk {
	@Override
	void addCondiments() {
		//空实现
	}

	@Override
	boolean customerWantCondiments() {
		return false;
	}

}
