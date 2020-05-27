package Builder.Buider;

/**
 * �û��࣬������ģʽ���ͻ��˲���֪���ڲ����ϸ�ڽ���Ʒ�ʹ�������ڸ������߶��������������
 * �Ҵ������������ָ���߿��ƣ����ǽ�������Ҫ�϶๲ͬ�㣬������������ڲ����ӾͲ�����
 * ������ģʽ��StringBuilder������ʹ�ã�Appendable�ӿ��ǳ������ߣ�AbstractStringBuilder�ǽ����߲���ʵ����
 * StringBuilder��ָ���ߣ�Ҳ�ǽ�����
 * ���󹤳�ʵ�ֲ�Ʒ����ϣ������Ĺ��̣�ֻ����ʲô����������������ģʽ�Ǹ�����ͼ�����Ʒ��ͨ����װ
 * ��������²�Ʒ
 */
public class Client {
	public static void main(String[] args) {
		//����ͨ����
		CommonHouse commonHouse = new CommonHouse();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		House house = houseDirector.constructHouse();

		System.out.println("--------------------------");
		//�Ǹ�¥
		HighBuilding highBuilding = new HighBuilding();
		//���ý�����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ��ӣ����ز�Ʒ(��¥)
		houseDirector.constructHouse();
	}
}
