package decorator;

/**
 * ��ͬ�ĵ����࣬���������ͼ�Ǯ
 */
public class Soy extends Decorator {
	public Soy(Drink obj) {
		super(obj);//�̳���Ʒ������
		setDes(" ����  ");
		setPrice(1.5f);
	}

}
