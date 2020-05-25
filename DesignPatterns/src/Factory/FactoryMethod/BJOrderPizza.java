package Factory.FactoryMethod;

/**
 * 北京的工厂生产北京披萨
 */
public class BJOrderPizza extends OrderPizza2 {
    @Override
    public Pizza2 creatPizza2(String orderType) {

        Pizza2 pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        // TODO Auto-generated method stub
        return pizza;
    }
}
