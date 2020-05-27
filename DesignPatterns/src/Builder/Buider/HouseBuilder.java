package Builder.Buider;

/**
 * ����Ľ�����
 */
public abstract class HouseBuilder {

    protected House house = new House();//house��Ʒ����Ͻ���

    //�����������д��, ����ķ���
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    //���췿�Ӻã� ����Ʒ(����) ���ظ��û�
    public House buildHouse() {
        return house;
    }

}
