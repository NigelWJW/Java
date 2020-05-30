package responsibilitychain;

/**
 * ������-ְ����ģʽ����������ֿ�����Ժã��򻯶��󣬶���֪�����Ľṹ����̫����Ӱ�����ܣ��ݹ���Բ��ǻ᷽�㣬�ʺ�
 * �༶�������̣���������
 * ��SpringMVC�е�HandlerExecutionChainʹ����ְ����ģʽ��SpringMVC������DispatcherServlet�յ�����󣬱���
 * HandleMapping���ϣ�����HandleInterceptor���������ص���preHandle��PostHandler��afterCompletion����ְ����
 * HandleExecutionChain
 */
public class Client {
	public static void main(String[] args) {
		//����һ������
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);

		//������ص�������
		DepartmentApprover departmentApprover = new DepartmentApprover("������");
		CollegeApprover collegeApprover = new CollegeApprover("��Ժ��");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("����У");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("١У��");

		//��Ҫ�����������������һ�����ú� (�����˹��ɻ���:��Ȼֱ�Ӹ�У��1000�������� )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		//�����󷢸�ְλ��͵�������
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
