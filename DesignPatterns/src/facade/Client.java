package facade;

/**
 * �ͻ�������-���ģʽ������������ϵͳ��ϸ�ڣ��Ҹ�����ά�����ֲ���ƿ��Կ���ʹ�ã����õĻ��ֲ�Σ�
 * ά��һ��������ϵͳ���Կ���ʹ�ã���߸����ԣ������ܹ��࣬��Ȼ��ֱ�ӵ���û��������
 * ��MyBatis��ʹ�������ϵͳ���ͻ�����Configuration������ഴ��MetaObject������ݲ�ͬ�Ķ��󴴽���
 * DefaultObjectFactory\DefaultObjectWrapperFactory\DefaultReflectFactory�Ⱦ�����ϵͳ��
 */
public class Client {
	public static void main(String[] args) {
		//ֱ�ӵ��ú��鷳����������෽����
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}

}
