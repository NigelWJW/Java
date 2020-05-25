package Factory;
/**
 * 伦敦子工厂
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza2 createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza2 pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}