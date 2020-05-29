package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * �����࣬��������ʧ�ṩһ�ֱ�������Ԫ�ص�ͳһ�ӿڣ���һ�µķ�����������Ԫ�أ�����Ҫ֪�����϶���ĵײ㣻
 * �ṩͳһ�������������ÿ��Ǿۺ����ͣ�ʹ��һ�ַ����Ϳ��Ա������������˾ۺϵ��ڲ��ṹ����
 * ������󼯺Ϻͱ������󼯺ϵ����ηֿ�������ÿ���ۺ϶���Ҫһ�������������Ի�ܶԲ��ù���
 * ��ArrayList��ʹ���ˡ��ڲ���Itrʵ�ֵ�����������ΪArrayList���ڲ��࣬List���ǾۺϽӿں��е��������������˵���������
 * Object������ѧԺ��Department�࣬��Itr��EnumIterator�Ƕ�Ӧ�ĵ�������LinkedList��ArrayList�Ǿ���ۺ���
 */
public class Client {
	public static void main(String[] args) {
		//����ѧԺ
		List<College> collegeList = new ArrayList<College>();

		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();

		collegeList.add(computerCollege);
		collegeList.add(infoCollege);

		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}
}
