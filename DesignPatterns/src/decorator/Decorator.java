package decorator;

/**
 * ����װ�θ���
 */
public class Decorator extends Drink {
	private Drink obj;

	public Decorator(Drink obj) { //�����Ʒ�࣬��ȡ��ͬ��Ʒ������
		this.obj = obj;
	}

	@Override
	public float cost() {
		// getPrice �ǵ����Լ��۸����obj��Ʒ�ļ۸�
		return super.getPrice() + obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes() �����װ���ߵ���Ϣ����obj��Ʒ������
		return des + " " + getPrice() + " && " + obj.getDes();
	}
}
