package responsibilitychain;

/**
 * ������ӿ�
 */
public abstract class Approver {
	Approver approver;  //��һ��������
	String name; // ��ǰ����

	public Approver(String name) {
		this.name = name;
	}

	//��һ��������
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	//������������ľ��巽�����õ�һ������, ������������ɾ����������ʵ�֣���˸÷����ڳ����������ɳ���
	public abstract void processRequest(PurchaseRequest purchaseRequest);

}
