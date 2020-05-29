package visitor;

/**
 * �����ࡣ������ģʽ����װһЩ������ĳ�����ݽṹ�ĸ�Ԫ�ز������������ڲ��ı����ݽṹ��ǰ���¶�����������ЩԪ�ص�
 * �µĲ����������ݽṹ�����ݲ������룬���ڱ����ʵ��������һ�������ṩ�Ӵ������ߵĽӿڣ������߸��ݱ���������ж�Ӧ��
 * ��������ҪӦ�ó����Ƕ�һ������ṹ�Ķ�����в�ͬ������صĲ�����ͬʱ�����໥��Ⱦ���ŵ��Ƿ��ϵ�һְ����չ�Ժ�
 * �Թ��ܽ���ͳһ�����������������ȶ���ϵͳ�����Ǿ���Ԫ�ضԷ����߹���ϸ�ڣ�Υ�������أ�Υ��������ת��û����������Ԫ��
 * ���ϵͳ�бȽ��ȶ������ݽṹ���о����仯�Ĺ������󣬾��ʺϷ�����ģʽ
 */
public class Client {
	public static void main(String[] args) {
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();

		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		//�ɹ�
		Success success = new Success();
		objectStructure.display(success);

		System.out.println("===============");
		Fail fail = new Fail();
		objectStructure.display(fail);

		System.out.println("=======�����Ǵ����Ĳ���========");

		Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
