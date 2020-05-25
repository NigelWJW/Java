package Factory.FactoryMethod;

/**
 * 伦敦的工厂生产伦敦披萨
 */
public class LDOrderPizza extends OrderPizza2 {
    @Override
    public Pizza2 creatPizza2(String orderType) {
        Pizza2 pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}