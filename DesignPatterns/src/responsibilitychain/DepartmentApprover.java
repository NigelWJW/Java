package responsibilitychain;

/**
 * 系处理类
 */
public class DepartmentApprover extends Approver {
	public DepartmentApprover(String name) {
		super(name);
	}

	@Override
	public void processRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getPrice() <= 5000) {
			System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
		} else {
			approver.processRequest(purchaseRequest);//让其他来处理
		}
	}

}
