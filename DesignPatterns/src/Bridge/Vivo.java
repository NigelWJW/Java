package Bridge;

/**
 * �ֻ�Ʒ�Ƶ�vivo
 */
public class Vivo implements Brand {
	@Override
	public void open() {
		System.out.println(" Vivo�ֻ����� ");
	}

	@Override
	public void close() {
		System.out.println(" Vivo�ֻ��ػ� ");
	}

	@Override
	public void call() {
		System.out.println(" Vivo�ֻ���绰 ");
	}

}
