package proxy.staticproxy;

/**
 * ��̬�����࣬�ڲ��޸�Ŀ�����Ĺ�����ͨ��������������չ������ʵ��һ���Ľӿڣ����кܶ�
 * �����࣬һ�����ӷ�����Ŀ��ʹ������Ҫά��
 */
public class Client {
    public static void main(String[] args) {
        //����Ŀ�����(���������)
        TeacherDao teacherDao = new TeacherDao();
        //�����������, ͬʱ����������󴫵ݸ��������
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        //ͨ��������󣬵��õ����������ķ���
        //����ִ�е��Ǵ������ķ��������������ȥ����Ŀ�����ķ���
        teacherDaoProxy.teach();
    }
}
