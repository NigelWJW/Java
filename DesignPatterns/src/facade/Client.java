package facade;

/**
 * 客户调用类-外观模式对外屏蔽了子系统的细节，且更容易维护，分层设计可以考虑使用，更好的划分层次，
 * 维护一个遗留大系统可以考虑使用，提高复用性，但不能过多，不然和直接调用没有区别了
 * 在MyBatis中使用了外观系统，客户调用Configuration即外观类创建MetaObject，会根据不同的对象创建如
 * DefaultObjectFactory\DefaultObjectWrapperFactory\DefaultReflectFactory等具体子系统类
 */
public class Client {
	public static void main(String[] args) {
		//直接调用很麻烦，调用外观类方便简洁
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
		homeTheaterFacade.ready();
		homeTheaterFacade.play();
		homeTheaterFacade.end();
	}

}
