package iterator;

import java.util.Iterator;

/**
 * �����ѧԺ
 */
public class ComputerCollege implements College {
    Department[] departments;
    int numOfDepartment = 0;// ���浱ǰ����Ķ������

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Javaרҵ", " Javaרҵ ");//���רҵ
        addDepartment("PHPרҵ", " PHPרҵ ");
        addDepartment("������רҵ", " ������רҵ ");
    }

    @Override
    public String getName() {
        return "�����ѧԺ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {//���ü����Ժ�ĵ�����
        return new ComputerCollegeIterator(departments);
    }

}
