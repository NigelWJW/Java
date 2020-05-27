package decorator;

/**
 * Component主体主类，其他都继承这个类
 */
public abstract class Drink {
	public String des; // 物品描述
	private float price = 0.0f;//物品价钱

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//计算费用的抽象方法
	//子类来实现
	public abstract float cost();
}
