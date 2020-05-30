package responsibilitychain;

/**
 * ��Ժ��������
 */
public class ViceSchoolMasterApprover extends Approver {
	public ViceSchoolMasterApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() < 10000 && purchaseRequest.getPrice() <= 30000) {
			System.out.println(" ������ id= " + purchaseRequest.getId() + " �� " + this.name + " ����");
		} else {
			approver.processRequest(purchaseRequest);
		}
	}
}
