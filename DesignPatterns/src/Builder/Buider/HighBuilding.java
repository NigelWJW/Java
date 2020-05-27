package Builder.Buider;

/**
 * 具体建筑者，高地
 */
public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" 高楼的打地基100米 ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" 高楼的砌墙20cm ");
	}

	@Override
	public void roofed() {
		System.out.println(" 高楼的透明屋顶 ");
	}

}
