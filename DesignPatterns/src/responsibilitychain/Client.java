package responsibilitychain;

/**
 * 调用类-职责链模式：将请求处理分开灵活性好，简化对象，对象不知道链的结构，链太长会影响性能，递归调试不是会方便，适合
 * 多级请求，流程，拦截器。
 * 在SpringMVC中的HandlerExecutionChain使用了职责链模式。SpringMVC是首先DispatcherServlet收到请求后，遍历
 * HandleMapping集合，再由HandleInterceptor拦截器拦截调用preHandle、PostHandler、afterCompletion方法职责链
 * HandleExecutionChain
 */
public class Client {
	public static void main(String[] args) {
		//创建一个请求
		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);

		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");

		//需要将各个审批级别的下一个设置好 (处理人构成环形:不然直接给校长1000会有问题 )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		//将请求发给职位最低的张主任
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
