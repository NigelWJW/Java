package Builder.Buider;

/**
 * ���彨���ߣ��ߵ�
 */
public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println(" ��¥�Ĵ�ػ�100�� ");
	}

	@Override
	public void buildWalls() {
		System.out.println(" ��¥����ǽ20cm ");
	}

	@Override
	public void roofed() {
		System.out.println(" ��¥��͸���ݶ� ");
	}

}
