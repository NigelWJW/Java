package proxy.staticproxy;

/**
 * �����࣬��д�ӿڷ����������ӿھۺϽ���
 */
//�������,��̬����
public class TeacherDaoProxy implements ITeacherDao {
	private ITeacherDao target; // Ŀ�����ͨ���ӿ����ۺ�

	//������
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	@Override
	public void teach() {//ʵ��Ŀ�����ķ������������Լ�������������
		System.out.println("��ʼ����  ���ĳЩ�������������� ");//����
		target.teach();//����Ŀ����󷽷�
		System.out.println("�ύ����������");//����
	}
}
