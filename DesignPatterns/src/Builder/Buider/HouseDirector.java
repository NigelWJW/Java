package Builder.Buider;

/**
 * ����ָ���ߣ��������߾ۺ��ڴ�
 */
//ָ���ߣ�����ȥָ���������̣����ز�Ʒ
public class HouseDirector {

	HouseBuilder houseBuilder = null;//�������߾ۺ��ڴ�

	//���������� houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//ͨ��setter �����޸� houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//��δ����췿�ӵ����̣�����ָ����
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}


}
