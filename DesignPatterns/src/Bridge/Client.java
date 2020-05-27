package Bridge;

/**
 * 调用者类，实现抽象和实现的分离，提供了系统的灵活性，替代了多层继承的方案，减少子类
 * 个数，降低成本，但是增加了理解和设计难度，常用于JDBC驱动程序，银行各种转账，不同类型的消息管理
 * 在JDBC中使用到了，其中的drive接口就是抽象接口，调用实现类的Connection类中的具体类
 * 如MySQLConnection等
 */
public class Client {
	public static void main(String[] args) {
		//获取折叠式手机 (样式 + 品牌 )
		Phone phone1 = new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.call();
		phone1.close();
		System.out.println("=======================");
		Phone phone2 = new FoldedPhone(new Vivo());
		phone2.open();
		phone2.call();
		phone2.close();
		System.out.println("==============");
		UpRightPhone phone3 = new UpRightPhone(new XiaoMi());
		phone3.open();
		phone3.call();
		phone3.close();
		System.out.println("==============");
		UpRightPhone phone4 = new UpRightPhone(new Vivo());
		phone4.open();
		phone4.call();
		phone4.close();
	}
}
