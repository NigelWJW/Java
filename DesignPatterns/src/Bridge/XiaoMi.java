package Bridge;

/**
 * �ֻ�Ʒ�Ƶ�С��
 */
public class XiaoMi implements Brand {

	@Override
	public void open() {
		System.out.println(" С���ֻ����� ");
	}

	@Override
	public void close() {
		System.out.println(" С���ֻ��ػ� ");
	}

	@Override
	public void call() {
		System.out.println(" С���ֻ���绰 ");
	}

}
