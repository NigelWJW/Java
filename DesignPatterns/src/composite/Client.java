package composite;

/**
 * �û��࣬���ģʽ��������������ģʽ��ʾ����;ֲ��Ĺ�ϵ�����˿ͻ��˲������ͻ���ֻ�����һ�µĶ������������Ͳ���
 * Ҳ�н�ǿ�Ŀ���չ�ԣ��������ӣ������������ʺϣ�����Ҫ��ϸߵĳ����ԣ�����ϴ�Ͳ��ʺ�
 * HashMap��ʹ�������ģʽ������Map��ΪComponent���������AbstractHashMap��HashMap��Composite��HashMap��
 * Node������Ҷ�ӽڵ�
 */
public class Client {
	public static void main(String[] args) {
		//�Ӵ�С�������� ѧУ
		OrganizationComponent university = new University("�廪��ѧ", " �й�������ѧ ");
		//���� ѧԺ
		OrganizationComponent computerCollege = new College("�����ѧԺ", " �����ѧԺ ");
		OrganizationComponent infoEngineercollege = new College("��Ϣ����ѧԺ", " ��Ϣ����ѧԺ ");
		//��������ѧԺ�����ϵ(רҵ)
		computerCollege.add(new Department("�������", " ������̲��� "));
		computerCollege.add(new Department("���繤��", " ���繤�̲��� "));
		computerCollege.add(new Department("�������ѧ�뼼��", " �������ѧ�뼼�������Ƶ�רҵ "));
		//
		infoEngineercollege.add(new Department("ͨ�Ź���", " ͨ�Ź��̲���ѧ "));
		infoEngineercollege.add(new Department("��Ϣ����", " ��Ϣ���̺�ѧ "));
		//��ѧԺ���뵽 ѧУ
		university.add(computerCollege);
		university.add(infoEngineercollege);
		//university.print();
		infoEngineercollege.print();
	}
}
