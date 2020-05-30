package responsibilitychain;

/**
 * 抽象处理接口
 */
public abstract class Approver {
	Approver approver;  //下一个处理者
	String name; // 当前名字

	public Approver(String name) {
		this.name = name;
	}

	//下一个处理者
	public void setApprover(Approver approver) {
		this.approver = approver;
	}

	//处理审批请求的具体方法，得到一个请求, 处理是子类完成具体请求处理的实现，因此该方法在抽象类中做成抽象
	public abstract void processRequest(PurchaseRequest purchaseRequest);

}
