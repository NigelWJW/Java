package Builder.Buider;

/**
 * 用户类，建造者模式：客户端不必知道内部组成细节将产品和创建解耦，内个建造者独立方便增加替代
 * 且创建步骤可以在指挥者控制，但是建造者需要较多共同点，如果差异大或者内部复杂就不适用
 * 建造者模式在StringBuilder类中有使用，Appendable接口是抽象建造者，AbstractStringBuilder是建造者不能实例化
 * StringBuilder是指挥者，也是建造者
 * 抽象工厂实现产品的组合，不关心过程，只关心什么工厂生产；建造者模式是根据蓝图建造产品，通过组装
 * 配件产生新产品
 */
public class Client {
	public static void main(String[] args) {
		//盖普通房子
		CommonHouse commonHouse = new CommonHouse();
		//准备创建房子的指挥者
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//完成盖房子，返回产品(普通房子)
		House house = houseDirector.constructHouse();

		System.out.println("--------------------------");
		//盖高楼
		HighBuilding highBuilding = new HighBuilding();
		//重置建造者
		houseDirector.setHouseBuilder(highBuilding);
		//完成盖房子，返回产品(高楼)
		houseDirector.constructHouse();
	}
}
