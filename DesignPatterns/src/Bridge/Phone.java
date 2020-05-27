package Bridge;

/**
 * �����༴������ά��ʵ���࣬��ʵû��ʲô��ֻ�ǵ��þ���ʵ���࣬�����ǾۺϹ�ϵ
 */
public abstract class Phone {

	//���Ʒ��
	private Brand brand;//��ʵ����ۺϽ���

	//������
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}

	protected void open() {
		this.brand.open();//�����ֻ�Ʒ�Ƶľ��巽��
	}

	protected void close() {
		brand.close();
	}

	protected void call() {
		brand.call();
	}

}
